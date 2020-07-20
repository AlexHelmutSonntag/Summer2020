import nmap
# Commented because they're of an old video
# nmap1 = nmap.PortScanner()
# a = nmap1.nmap_version()
# print(a)

# This file is about building an nmap Scanner

ns = nmap.PortScanner() #Creates a port scanner
print(ns.nmap_version()) #displays the nmap version

ns.scan('192.168.0.1','22-445','-v --version-all') #Scans within the arguments provided

# print(ns.scaninfo())
# print(ns.csv())

print(ns.scanstats())# fetches the stats of the latest scan
# print(ns.all_hosts()) #fetches all the hosts in the network

# print(ns['192.168.0.1'].state())#This method "state" fetches the state of the IP mentioned whether it's up or down 

print(ns['192.168.0.1'].all_protocols()) #This fetches the internet protocol 


print(ns['192.168.0.1']['tcp'].keys())
# We are specifying and asking what ports are open for the ip of 192.168.0.1 of protocol tcp
# dict_keys([25, 53, 80, 110, 119, 143])
print(ns['192.168.0.1'].has_tcp(25)) #This one searches at the ip as the tcp and checks if the argument passed exists. returns a boolean value
