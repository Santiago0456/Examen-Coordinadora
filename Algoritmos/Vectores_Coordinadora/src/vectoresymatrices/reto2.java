

package vectoresymatrices;

import java.text.DecimalFormat;
import java.util.*;
import javax.swing.JOptionPane;

public class reto2 {

public static void main(String[] args) {
Scanner leer=new Scanner (System.in);
double mat[][],vec[]=new double[7],lunes=0,martes=0,miercoles=0,jueves=0,viernes=0,sabado=0,domingo=0,mayor,menor,lunmayor[]=new double[7],marmayor[]=new double[7],miermayor[]=new double[7],juemayor[]=new double[7],
        viermayor[]=new double[7],sabmayor[]=new double[7],dommayor[]=new double[7],variablel=1,vecdial[]=new double[7],variablem=1,vecdiam[]=new double[7],variablemi=1,vecdiami[]=new double[7],variablej=1,vecdiaj[]=new double[7],
        variablev=1,vecdiav[]=new double[7],variables=1,vecdias[]=new double[7],variabled=1,vecdiad[]=new double[7];
int indicel=0,N,kl=0,km=0,kmi=0,kj=0,kv=0,ks=0,kd=0,i,j,posima=0,posime=0,contl=0,contm=0,pl[]=new int[7],jm=1;

System.out.println("¿Cuántas vacas tiene usted?");
N=leer.nextInt();

 while (N>50){
       System.out.println("Usted no puede tener más de 50 vacas, ingrese nuevamente la cantidad de vacas que tiene");
       N=leer.nextInt();
       }

mat=new double[7][N];
System.out.println("Vamos a rellenar los datos");
for (i=0;i<7;i++){
    for (j=0;j<N;j++){
        System.out.println("Ingrese cuántos litros produjo la vaca "+(j+1)+" el día "+(i+1));
        mat[i][j]=leer.nextDouble();
        while (mat[i][j]<0 || mat[i][j]>11.9) { 
        System.out.println ("Dato incorrecto, ingrese nuevamente la cantidad de litros de la vaca "+(j+1)+" el día "+(i+1));
        mat[i][j]=leer.nextInt();
                }
        if (i==0) {
            lunes=lunes+mat[i][j]; 
            if (mat[i][j]>variablel){          
                variablel=mat[i][j];                               
            }
              
        }
       
    
        if (i==1){
            martes=martes+mat[i][j];  
            if (mat[i][j]>variablem){          
            variablem=mat[i][j];                               
            }
        }
        
        
        if (i==2){
            miercoles=miercoles+mat[i][j];
            if (mat[i][j]>variablemi){          
            variablemi=mat[i][j];                               
            }
        }
        
        if (i==3){
            jueves=jueves+mat[i][j];
            if (mat[i][j]>variablej){          
            variablej=mat[i][j];                               
            }            
        }
        
        if (i==4){
            viernes=viernes+mat[i][j];
            if (mat[i][j]>variablev){          
            variablev=mat[i][j];                               
            }             
        }
         
        if (i==5){
            sabado=sabado+mat[i][j]; 
            if (mat[i][j]>variables){          
            variables=mat[i][j];                               
            }             
        }
       
        if (i==6){
            domingo=domingo+mat[i][j];
            if (mat[i][j]>variabled){          
            variabled=mat[i][j];                               
            }            
        }
       
}

        }

for (j=0;j<N;j++){
    if (mat[0][j]==variablel){
        lunmayor[kl]=mat[0][j];
        vecdial[kl]=j+1;
        kl++;
        indicel=kl;
    }
}

for (j=0;j<N;j++){
    if (mat[1][j]==variablem){
        marmayor[km]=mat[0][j];
        vecdiam[km]=j+1;
        km++;
    }
}

for (j=0;j<N;j++){
    if (mat[2][j]==variablemi){
        miermayor[kmi]=mat[0][j];
        vecdiami[kmi]=j+1;
        kmi++;
    }
}

for (j=0;j<N;j++){
    if (mat[3][j]==variablej){
        juemayor[kj]=mat[0][j];
        vecdiaj[kj]=j+1;
        kj++;
    }
}

for (j=0;j<N;j++){
    if (mat[4][j]==variablev){
        viermayor[kv]=mat[0][j];
        vecdiav[kv]=j+1;
        kv++;
    }
}

for (j=0;j<N;j++){
    if (mat[5][j]==variables){
        sabmayor[ks]=mat[0][j];
        vecdias[ks]=j+1;
        ks++;
        
    }
}

for (j=0;j<N;j++){
    if (mat[6][j]==variabled){
        dommayor[kd]=mat[0][j];
        vecdiad[kd]=j+1;
        kd++;
    }
}
vec[0]=lunes;
vec[1]=martes;
vec[2]=miercoles;
vec[3]=jueves;
vec[4]=viernes;
vec[5]=sabado;
vec[6]=domingo;  

mayor=menor=vec[0];
     for (i=0;i<7;i++){
     if (vec[i]>mayor){
         mayor=vec[i];
         posima=i;
     }
     if(vec[i]<menor){
         menor=vec[i];
         posime=i;
     }
     }

       
DecimalFormat formato1=new DecimalFormat("0.#");

System.out.println("Producción total del hato en cada uno de los 7 días");
System.out.println("Día 1: "+formato1.format(lunes));
System.out.println("Día 2: "+formato1.format(martes));
System.out.println("Día 3: "+formato1.format(miercoles));
System.out.println("Día 4: "+formato1.format(jueves));
System.out.println("Día 5: "+formato1.format(viernes));
System.out.println("Día 6: "+formato1.format(sabado));
System.out.println("Día 7: "+formato1.format(domingo));
System.out.println(" ");
System.out.println("Día de la semana con mayor y menor producción");
System.out.println("Mayor producción: Día "+(posima+1)+" con una producción de: "+mayor+" litros");
System.out.println("Menor producción: Día "+(posime+1)+" con una producción de: "+menor+" litros");
System.out.println(" ");
System.out.println("El número de la(s) vaca(s) que dio más leche en cada día");

System.out.print("Día 1 con "+variablel+" litros: "); 
for (i=0;i<kl;i++){
System.out.print("Vaca "+formato1.format(vecdial[i])+" - ");
}
System.out.println(" ");
System.out.print("Día 2 con "+variablem+" litros: "); 
for (i=0;i<km;i++){
System.out.print("Vaca "+formato1.format(vecdiam[i])+" - ");
}
System.out.println(" ");
System.out.print("Día 3 con "+variablemi+" litros: "); 
for (i=0;i<kmi;i++){
System.out.print("Vaca "+formato1.format(vecdiami[i])+" - ");
}
System.out.println(" ");
System.out.print("Día 4 con "+variablej+" litros: "); 
for (i=0;i<kj;i++){
System.out.print("Vaca "+formato1.format(vecdiaj[i])+" - ");
}
System.out.println(" ");
System.out.print("Día 5 con "+variablev+" litros: "); 
for (i=0;i<kv;i++){
System.out.print("Vaca "+formato1.format(vecdiav[i])+" - ");
}
System.out.println(" ");
System.out.print("Día 6 con "+variables+" litros: "); 
for (i=0;i<ks;i++){
System.out.print("Vaca "+formato1.format(vecdias[i])+" - ");
}
System.out.println(" ");
System.out.print("Día 7 con "+variabled+" litros: "); 
for (i=0;i<kd;i++){
System.out.print("Vaca "+formato1.format(vecdiad[i])+" - ");
}
    }
}
