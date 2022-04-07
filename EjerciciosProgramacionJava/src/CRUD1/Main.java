/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD1;


import java.util.Scanner;
import java.sql.*;


/**
 *
 * @author sanxo
 */
public class Main {
    
    public static void main(String[] args) throws SQLException {
        
        Scanner in = new Scanner (System.in);
        BDController.conectar();
        
       //BDController.createPedidoCliente("52", "51", "50", "123456789", "1989-02-06", 1, "b5", "B5", 0, 1, "2022-02-04");

    }
    
}
