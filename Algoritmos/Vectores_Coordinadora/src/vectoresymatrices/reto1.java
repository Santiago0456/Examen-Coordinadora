package vectoresymatrices;

import java.util.*;
import javax.swing.JOptionPane;
public class reto1 {

  
    public static void main(String[] args) {
    Scanner leer=new Scanner (System.in);
    
    int vec1[]=new int[15],vec2[]=new int[15];
    int x,y,i,j,n,temp,mayor;
    int ced=0;
    
    System.out.println("Ingrese cuántas posiciones desea que tenga el vector 1");
    x=leer.nextInt();
    
    while (x>15){
       System.out.println("El número máximo que puede ingresar es 15, ingrese un número igual o menor a 15");
       x=leer.nextInt();
              }

    for (i=0;i<x;i++){
        System.out.println("Ingrese el "+(i+1)+" número del vector 1");        
        vec1[i]=leer.nextInt();
        while (vec1[i]<=0 || vec1[i]>30) { 
        System.out.println ("Solo es permitido valores de 1 a 30, por favor ingrese otro número");
        vec1[i]=leer.nextInt();
                }
    }
   
    for (i=0;i<x-1;i++){
        for (j=0;j<x-1;j++){
           if (vec1[j]>vec1[j+1]){
           temp=vec1[j];
           vec1[j]=vec1[j+1];
           vec1[j+1]=temp;
          }    
       }
    }
    
    
    System.out.println("Ingrese cuántas posiciones desea que tenga el vector 2");
    y=leer.nextInt();
    
    while (y>15){
       System.out.println("El número máximo que puede ingresar es 15, ingrese un número igual o menor a 15");
       y=leer.nextInt();
              }

    for (i=0;i<y;i++){
        System.out.println("Ingrese el "+(i+1)+" número del vector 2");        
        vec2[i]=leer.nextInt();
        while (vec2[i]<=0 || vec2[i]>30) { 
        System.out.println ("Solo es permitido valores de 1 a 30, por favor ingrese otro número");
        vec2[i]=leer.nextInt();
                }
    }
   
    for (i=0;i<y-1;i++){
        for (j=0;j<y-1;j++){
           if (vec2[j]>vec2[j+1]){
           temp=vec2[j];
           vec2[j]=vec2[j+1];
           vec2[j+1]=temp;
          }    
       }
    }
    
    
    System.out.println("Así quedó organizado el vector 1");
    for (i=0;i<x;i++){
    System.out.println(vec1[i]);}
    System.out.println("==========================");
    
    System.out.println("Así quedó organizado el vector 2");
    for (i=0;i<y;i++){
    System.out.println(vec2[i]);}
    System.out.println("==========================");
    System.out.println("La suma de los vectores según su posición es:");
    
    if (x>y){
        mayor=x;         
    } 
    else {
        mayor=y;
    }
    
    
    for (i=0;i<mayor;i++){
    System.out.println(vec1[i]+vec2[i]);  
            }
        }
     }