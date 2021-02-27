import java.io.*;
import java.util.Scanner;

class HotelFileHandling{
	String hotelId,password,hotelName;
	int seats;

	public HotelFileHandling(String loginId){
		hotelId=loginId;
	}
	
	public HotelFileHandling(String loginId,String pass_word,String hotel_Name,int seats_){
		hotelId=loginId;
		password=pass_word;
		hotelName=hotel_Name;
		seats=seats_;
	}
	
	public boolean CreateFile(){
		boolean creation=false;
		String filename=hotelId+".txt";
		try{
			File obj = new File(filename);
			if(obj.createNewFile()){
				creation=true;
			}
		}	
		catch(IOException e){
			System.out.println("error");
		}
		return creation;
	}

	public void WriteFile(){
		
		try{
			FileWriter myWriter= new FileWriter(hotelId);
			BufferedWriter obj1=new BufferedWriter(myWriter);
			obj1.append(password);
			obj1.newLine();			
			obj1.append(hotelId);
			obj1.newLine();
			obj1.append(hotelName);
			obj1.newLine();
			obj1.append(String.valueOf(seats));
			obj1.close();
			
		}
		catch(IOException e){
			System.out.println("An error occured");
		}
	}

	public boolean CheckLogin(){
		String filename=hotelId+".txt";
		boolean login=false;
		 try {
			File obj2 = new File(filename);
      			Scanner obj3 = new Scanner(obj2);
			password2=myReader.nextLine();
			if(password2.equals(password)){
				login=true;
			}
      			
      			obj3.close();
		}
   		catch (FileNotFoundException e) {
      			System.out.println("An error occurred.");
      			
    		}
		return login;
	}
	
	public String HotelName(){
		return hotelName;
	}
	
	public int Seats(){
		return seats;
	}
	

}			
		
		