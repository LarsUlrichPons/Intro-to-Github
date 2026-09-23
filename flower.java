import javax.swing.JOptionPane;

public class flower{
public static void main (String[] args){



String welcome = JOptionPane.showMessageDialog(null,"Kamusta kana")


String Type = JOptionPane.showInputDialog(null, "++++++++++++++++\n"
                                              + "FLOWER COMAPANY\n"
                                              + "++++++++++++++++\n"
                                              + "A.Sunflower-P80\n"
                                              + "B.Daisy-P35\n"
                                              + "C.Roses-P100\n"
                                              + "Input your flower type: ","MESSAGE", JOptionPane.QUESTION_MESSAGE);
                                              
String Size = JOptionPane.showInputDialog(null,"++++++++++++++++\n"
                                              + "FLOWER SIZE\n"
                                              + "+++++++++++++++\n"
                                              + "1.Bridal-P300\n"
                                              + "2.Bridal Deluxe-P500\n"
                                              + "3.Bridesmaid-P275\n"
                                              + "4.SmallBridesmaid-P150\n"
                                              + "Input your flower size: ","MESSAGE",JOptionPane.QUESTION_MESSAGE);
                                              
String Discount = JOptionPane.showInputDialog(null, "Are you a Bride <Y/N:>", "MESSAGE", JOptionPane.QUESTION_MESSAGE);

char FlowerType=Type.charAt(0);
char FlowerSize=Size.charAt(0);
char discount=Discount.charAt(0);

double amount=0;
double totalBill;

if(FlowerType=='A' || FlowerType=='a'){
  if(FlowerSize=='1'){
  amount=380;
   } else if(FlowerSize=='2'){
     amount=580;    
   } else if(FlowerSize=='3'){
     amount=355;      
   } else if(FlowerSize=='4'){
     amount=230;
   } else {
   JOptionPane.showMessageDialog(null,"INVALID FLOWER SIZE!");
   }

   } else if(FlowerType=='B' || FlowerType=='b'){
      if(FlowerSize=='1'){
      amount=335;
        }else if(FlowerSize=='2'){
         amount=535;  
        }else if(FlowerSize=='3'){
         amount=310;     
        }else if(FlowerSize=='4'){
         amount=185;
        }else{ 
          JOptionPane.showMessageDialog(null,"INVALID FLOWER SIZE!");
          }
          
    } else if(FlowerType=='C' || FlowerType=='c'){
         if(FlowerSize=='1'){
        amount=400;   
        }else if(FlowerSize=='2'){
         amount=600;   
        }else if(FlowerSize=='3'){
         amount=375;    
        }else if(FlowerSize=='4'){
         amount=250;
        }else{
          JOptionPane.showMessageDialog(null,"INVALID FLOWER SIZE!");
         }
         
if(discount=='y' || discount=='Y'){
totalBill=(amount*.2)+amount;
String bill=String.format("Total Bill: %,.2f", totalBill);
JOptionPane.showMessageDialog(null, "" +bill);
}

else if (discount=='n' || discount=='N'){
totalBill=amount;
String bill=String.format("Total Bill: %,.2f", totalBill);
JOptionPane.showMessageDialog(null, "" +bill);
}
else 
JOptionPane.showMessageDialog(null,"INVALID!");
  }
  }
}
