/* 
 * Copyright 2019 AdrianGV  adrian.gimeno.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author AdrianGV adrian.gimeno.alum@iescamp.es
 */
public final class Main {
    
    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");
    
    public static void main (String[] args){
        
        //Dato
        double x = 0.0;
        
        //Control
        boolean control = true;
        
        do{
            try{
                
                System.out.print("Inserta un numerico real ...:");
                x = SCN.nextDouble();
                
                control = false;
                
            }catch(Exception e){
                
                System.out.println("Entrada incorrecta");
                
            } finally{
                SCN.nextLine();
            }
        } while (control);
        
        System.out.println("<--->");
        System.out.printf("El numerito es.. %f%n", x);
    }
}
