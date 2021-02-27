import java.io.*;

class UserFileHandling{
	String phno,customerName;
	int seatsReq;
	
	public UserFileHandling(String PHNO){
		phno=PHNO;
	}

	public UserFileHandling(String PHNO,String cname,int sreq){
		phno=PHNO;
		customerName=cname;
		seatsReq=sreq;
	}		
	public boolean CreateFile(){
		boolean creation=false;
		try{
			String filename=phno+".txt";
			File obj = new File(filename);
			if(obj.createNewFile()){
				creation = true;
			}
			
		}
		catch(IOException e){
			System.out.println("file not created");
			e.printStackTrace();
		}
		return creation;
	}
	public void WriteFile(){
		
		try{
			FileWriter myWriter= new FileWriter(filename);
			BufferedWriter obj=new BufferedWriter(myWriter);
			obj.append(phno);
			obj.newLine();
			obj.append(customerName);
			obj.newLine();
			obj.append(seatsReq);
			}
			
			obj.close();
			
		}
		catch(IOException e){
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}
	public DeleteFile(Stirng phno){
		String filename=phno+"txt";
		File myObj = new File(filename);
		if(myObj.delete()){
			System.out.println("Deleted File: "+myObj.getName());
		}
		else{
			System.out.println("Failed to delete the file:");
		}
	}
}