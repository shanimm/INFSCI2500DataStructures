import java.util.Scanner;

public class Sequence<E>{
    public Object[] data;
    public int size;

    public Sequence(int n) throws IllegalArgumentException{
        if(n<0){
            throw new IllegalArgumentException();}
        this.data=new Object[n];
        this.size=0;
    }

    public int size(){
        return this.size;
    }

    public void append(E element){            
        if(this.size<this.data.length){
            this.data[this.size]=element;
        }
        else{
            Object[] temp=new Object[this.size+1];
            System.arraycopy(this.data, 0, temp, 0, this.size);
            this.data=temp;
            this.data[this.size]=element;
        }
        this.size++;    
    }

    public Object get(int k) throws IndexOutOfBoundsException{
            if(k<0 || k>=this.size){
                throw new IndexOutOfBoundsException();}
            return this.data[k];
    }

	public void print(){
		System.out.print("\nCurrent Sequence: ");
		for(int i=0;i<this.size();i++){
            System.out.print(this.get(i)+" ");
        }
		System.out.println();
	}
	
    public void insert(int index, E newElement){
       Object[] temp=new Object[this.size+1];
            System.arraycopy(this.data, 0, temp, 0, this.size);
            this.data=temp;
			for (int i=this.size;i>index;i--){
				this.data[i]=this.data[i-1];
			}
			for (int j=index;j<index+1;j++){
				this.data[j]=newElement;
			}
        Object[] temp1=new Object[this.size+1];
        System.arraycopy(this.data, 0, temp, 0, this.size+1);
        this.data=temp;
    }

	public void delete(int index){
		//IMPLEMENT ME
		for(int i=index;i<this.size-1;i++){
			this.data[i]=this.data[i+1];
	}
        Object[] temp=new Object[this.size-1];
        System.arraycopy(this.data, 0, temp, 0, this.size-1);
        this.data=temp;

            
	}
	
    public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		Sequence<Integer> s = new Sequence<Integer>(5);
		s.append(1);
		s.append(2);
		s.append(3);
		s.append(4);
		s.append(5);
		s.print();
		
		//INSERT CONTROL LOOP HERE
		int y= 1;
		while (y==1){
			
			System.out.print(" Please Enter 1 to Insert ,2 to delete,3 to quit");
			 int a;
			 a = in.nextInt();

			if(a==1){

			System.out.println("Enter Value to Insert ");
				int b=in.nextInt();

			System.out.println("Enter Position");
				int c=in.nextInt();
			s.insert(c,b);
			s.print();
			}
			else if(a==2){

				System.out.println("Enter Position to Delete");
				int d=in.nextInt();
				s.delete(d);
				s.print();
			}
			else y=0;
			
		}
	
	
				
			
		
    }   //End main
}   //End class