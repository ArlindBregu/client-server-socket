package com.example;

import java.io.*;
import java.net.*;


public class Client {

    String nomeServer = "localhost";
    int portaServer = 6789;
    Socket miosoket;
    BufferedReader tastiera;
    String stringaUtente;
    String stringaRicevutaDalServer;
    DataOutputStream outVersoServer;
    BufferedReader inDalServer;

    public Socket connetti(){

        System.out.println("2 CLIENT partito in esecuzione ...");

        try {
            
            tastiera = new BufferedReader(new InputStreamReader(System.in));

            miosoket = new Socket(nomeServer, portaServer);

        } catch (Exception e) {
            //TODO: handle exception
        }

    }
    
}
