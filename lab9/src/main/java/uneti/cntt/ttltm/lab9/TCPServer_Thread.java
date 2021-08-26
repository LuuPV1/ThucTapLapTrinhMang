/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uneti.cntt.ttltm.lab9;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

/**
 *
 * @author phaml
 */
public class TCPServer_Thread extends Thread {

    ServerSocket mServer;
    JTextArea mTxaStatus; //JTextArea để lưu status của Server

    public TCPServer_Thread(JTextArea txaStatus) {
        mTxaStatus = txaStatus;
    }

    @Override
    public void run() {
        try {
            String so1, so2, so3;
            int tong;
            mServer = new ServerSocket(1234);
            mTxaStatus.append("Server đã sẵn sàng!\nĐang chờ dữ liệu...\n\n");
            while (true) {
                Socket connectionSocket = mServer.accept();
                DataInputStream inFromClient = new DataInputStream(connectionSocket.getInputStream());
                DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
                so1 = inFromClient.readLine();
                so2 = inFromClient.readLine();
                mTxaStatus.append("Đã nhận 2 số a = " + so1 + ", b = " + so2 + "\n");
                int a = Integer.parseInt(so1);
                int b = Integer.parseInt(so2);
            }
        } catch (IOException ex) {
            Logger.getLogger(TCPServer_Thread.class.getName()).log(Level.SEVERE,
                    null, ex);
            mTxaStatus.append("Server đã xảy ra lỗi\n");
        }

    }
    
    public void StopServer()
 {
        super.stop();
        try {
            mServer.close();
        } catch (IOException ex) {
            Logger.getLogger(TCPServer_Thread.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
    }
}
