import javax.swing.JOptionPane;
public class BooleanDemo {
public static void main(String[] args) {
String people, player;
int Npeople, Nplayer, groupsize1, groupsize2;
people = JOptionPane.showInputDialog("Enter number of people: ");
player = JOptionPane.showInputDialog("Enter number of players: ");
Npeople = Integer.parseInt(people);
Nplayer = Integer.parseInt(player);
groupsize1 = Npeople/2;
groupsize2 = Npeople/3;

if(Npeople>10){
JOptionPane.showMessageDialog(null,"Number of people :" + Npeople + "\nGroupsize: " + groupsize1 );		
}
else if(Npeople>3){
JOptionPane.showMessageDialog(null, "Number of people :" + Npeople + "\nGroupsize: " + groupsize2 );
}
else{
JOptionPane.showMessageDialog(null,"The number of people has to be at least 3");
}
if(Nplayer>=11 && Nplayer<=55){
JOptionPane.showMessageDialog(null,"The number of players: "+ Nplayer + "\nTeam size: " + Nplayer/11);
}
else{
JOptionPane.showMessageDialog(null, "The number of players: "+ Nplayer +"\nTeam size: 1");
}	
}
}