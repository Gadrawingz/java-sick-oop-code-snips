package com.gadrawingz4;

class LowCohesiveReader {

    // Unrelated funcs()
    public boolean validateLocation(String pathIP) {
        return ping(pathIP) && checkFTP(pathIP);
    }

    private boolean ping(String pathIP) {
        return true;
    }

    private boolean checkFTP(String pathIP) {
        return true;
    }

    // Functions related to read resource:
    // real the resource from disk
    public String readFromDisk(String fileName) {
        return "Data of "+fileName;
    }

    public String readFromWeb(String url) {
        return "Data of "+url;
    }

    public String readFromNetwork(String netAddress) {
        return "Data of "+netAddress;
    }
}

public class CohesionLowCohesive {
    public static void main(String[] args) {

        LowCohesiveReader low = new LowCohesiveReader();
        System.out.println(low.readFromDisk("Photos"));
        System.out.println(low.readFromWeb("https://www.donnekt.com"));
        System.out.println(low.readFromNetwork("192.168.10.11"));

        // Simple
        System.out.println(low.validateLocation("10.10.10.10"));

    }
}
