/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmpsc472hw1;

import java.util.*;
import java.io.*;
class Notepad 
{
    public static void main(String[] args) 
    {
	Runtime rs = Runtime.getRuntime();
	try 
        {
            rs.exec("notepad");
	}
	catch (IOException e) 
        {
            System.out.println(e);
	}
    }
}
