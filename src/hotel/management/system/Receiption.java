
package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Receiption extends JFrame implements ActionListener{
    JButton newCustomer,Rooms,department,allEmployee,managerInfo,customers,searchRoom,update,roomStatus,pickup,checkout,logout;
    Receiption(){
    getContentPane().setBackground(Color.white);
    setLayout(null);
    
    newCustomer=new JButton("New Customer Form");
    newCustomer.setBounds(10,30,200,30);
    newCustomer.setBackground(Color.BLACK);
    newCustomer.setForeground(Color.white);
    newCustomer.addActionListener(this);
    add(newCustomer);
    
    Rooms=new JButton("Rooms");
    Rooms.setBounds(10,70,200,30);
    Rooms.setBackground(Color.BLACK);
    Rooms.setForeground(Color.white);
    Rooms.addActionListener(this);
    add(Rooms);
    
    department=new JButton("Department");
    department.setBounds(10,110,200,30);
    department.setBackground(Color.BLACK);
    department.setForeground(Color.white);
    department.addActionListener(this);
    add(department);
    
    allEmployee=new JButton("All Employees");
    allEmployee.setBounds(10,150,200,30);
    allEmployee.setBackground(Color.BLACK);
    allEmployee.setForeground(Color.white);
    allEmployee.addActionListener(this);
    add(allEmployee);
    
    customers=new JButton("Customer Info");
    customers.setBounds(10,190,200,30);
    customers.setBackground(Color.BLACK);
    customers.setForeground(Color.white);
    customers.addActionListener(this);
    add(customers);
    
    managerInfo=new JButton("Manager Info");
    managerInfo.setBounds(10,230,200,30);
    managerInfo.setBackground(Color.BLACK);
    managerInfo.setForeground(Color.white);
    managerInfo.addActionListener(this);
    add(managerInfo);
    
    checkout=new JButton("CheckOut");
    checkout.setBounds(10,270,200,30);
    checkout.setBackground(Color.BLACK);
    checkout.setForeground(Color.white);
    checkout.addActionListener(this);
    add(checkout);
    
    update=new JButton("Update Status");
    update.setBounds(10,310,200,30);
    update.setBackground(Color.BLACK);
    update.setForeground(Color.white);
    update.addActionListener(this);
    add(update);
    
    roomStatus=new JButton("Update Room Status");
    roomStatus.setBounds(10,350,200,30);
    roomStatus.setBackground(Color.BLACK);
    roomStatus.setForeground(Color.white);
    roomStatus.addActionListener(this);
    add(roomStatus);
    
    pickup=new JButton("Pickup Service");
    pickup.setBounds(10,390,200,30);
    pickup.setBackground(Color.BLACK);
    pickup.setForeground(Color.white);
    pickup.addActionListener(this);
    add(pickup);
    
    searchRoom=new JButton("Search Rooms");
    searchRoom.setBounds(10,470,200,30);
    searchRoom.setBackground(Color.BLACK);
    searchRoom.setForeground(Color.white);
    searchRoom.addActionListener(this);
    add(searchRoom);
    
    logout=new JButton("Logout");
    logout.setBounds(10,430,200,30);
    logout.setBackground(Color.BLACK);
    logout.setForeground(Color.white);
    logout.addActionListener(this);
    add(logout);
    
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/fourth.jpg"));
    JLabel image=new JLabel(i1);
    image.setBounds(250,30,500,470);
    add(image);


    
    
    setBounds(350,200,800,570);
    setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
     if(ae.getSource()==newCustomer){
        setVisible(false);
        new AddCustomer();
     }else if(ae.getSource()==Rooms){
         setVisible(false);
         new Room();
     }
     else if(ae.getSource()==department){
        setVisible(false);
        new Department();}
    
    else if(ae.getSource()==allEmployee){
        setVisible(false);
        new EmployeeInfo();
    }
    else if(ae.getSource()==managerInfo){
        setVisible(false);
        new ManagerInfo();}
    else if(ae.getSource()==customers){
        setVisible(false);
        new CustomerInfo();}
    else if(ae.getSource()==searchRoom){
       setVisible(false);
       new SearchRoom();}
    else if(ae.getSource()==update){
       setVisible(false);
       new UpdateCheck();}
    else if(ae.getSource()==roomStatus){
     setVisible(false);
     new UpdateRoom();}
    else if(ae.getSource()==pickup){
     setVisible(false);
     new Pickup();}
    else if(ae.getSource()==checkout){
     setVisible(false);
    new Checkout();}
    else if(ae.getSource()==logout){
     setVisible(false);
    System.exit(0);}}
    
    public static void main(String[]args){
        new Receiption();
    }
}
