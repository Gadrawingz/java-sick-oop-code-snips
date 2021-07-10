package com.gadrawingz4;

class HighCohesiveReader {

    // Functions related to read resource

    // read the resource from disk
    public String readFromDisk(String fileName) {
        return "Data of "+fileName;
    }

    // read the resource from web
    public String readFromWeb(String url) {
        return "Data of "+url;
    }

    // read the resource from net
    public String readFromNetwork(String netAddress) {
        return "Data of "+netAddress;
    }
}

public class CohesionHighCohesive {
    public static void main(String[] args) {

        HighCohesiveReader low = new HighCohesiveReader();
        System.out.println(low.readFromDisk("Photos"));
        System.out.println(low.readFromWeb("https://www.donnekt.com"));
        System.out.println(low.readFromNetwork("192.168.10.11"));

    }
}
