public class ValidateIPAddress {

    // Method to validate an IPv4 address
    public static boolean isValidIPv4(String ip) {
        //255 regex (25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]\\d|\\d)

        String regex = "^(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]\\d|\\d)\\."
                     + "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]\\d|\\d)\\."
                     + "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]\\d|\\d)\\."
                     + "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]\\d|\\d)$";
        
        return ip.matches(regex);
    }

    public static void main(String[] args) {
        String[] ipAddresses = {
            "192.168.1.1",  
            "255.255.255.255", 
            "0.0.0.0",        
            "256.100.50.25",  
            "192.168.1",      
            "192.168.1.300",  
            "abc.def.ghi.jkl" 
        };

        // Loop through each IP and validate it
        for (String ip : ipAddresses) {
            System.out.println(ip + " is " + (isValidIPv4(ip) ? "Valid" : "Invalid"));
        }
    }

}
