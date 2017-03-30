import java.util.*;
int front=-1,rear=-1,q[MAX],i;

//Function to insert elements in queue
class fifo
{
void insertq(int x)
{
 if(rear==MAX-1)
  System.out.println("\nOVERFLOW");
 else
 {
  rear++;
  q[rear]=x;
  if(front==-1)  	//Queue initially is empty
   front=0;
 }
}

//Function to delete elements from queue

void delq()
{
 if(front==-1)
  System.out.println("\nUNDERFLOW");
 else
 {
  printf("\nThe element deleted is %d " ,q[front]);
  if(front==rear)      	//The only element is being deleted
   front=rear=-1;
  else
   front++;
 }
}

void display()
{
 for(i=front;i<=rear;i++)
  System.out.println("%d\t",q[i]);
}
static void main(String args[])
{
  void insertq(int);
  void delq();
  void display();
  int ch;
  int x;
  Scanner sc=new Scanner(System.in);
  while(1)
 {
  System.out.println("\n******MENU******");
  System.out.println("\n1.Insert an element " );
  System.out.println("\n2.Delete an element  ");
  System.out.println("\n3.Display the queue ");
  System.out.println("\n4.Exit ");
  System.out.println("\nEnter your choice : ");
  ch=sc.nextInt(
  switch(ch)
  {
   case 1:
    printf("\nEnter the element ");
    scanf("%d",&x);
    insertq(x);
    break;
   case 2:
    delq();
    break;
   case 3:
    display();
    break;
   case 4:
    exit(0);
  }

 }
 getch();
}
}