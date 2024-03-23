#include <stdio.h>

// Capacity of array
#define Size 5

// Stack
// Push, isEmpty, isFull, Pop, Peek, Display

int arr[Size];
// top -> -1
int top=-1;

int isEmpty(){
    if(top==-1)
    return 1;
    else
    return 0;
}

int isFull(){
    if(top==Size-1)
    return 1;
    else
    return 0;
}

void push(int data){
    if(isFull())
    printf("Stack Overflow Error!\n");
    else
    arr[++top]=data;
}

int pop(){
    if(isEmpty())
    {
        printf("Stack Underflow Error!\n");
        return -1;
    }
    else
    {
        return arr[top--];
    }
}

int peek(){
    if (isEmpty())
    {
        printf("Stack Underflow Error!\n");
        return -1;
    }
    else
    {
        return arr[top];
    }
    
}

void display(){
    if (isEmpty())
    printf("Stack is Empty!\n");
    else
    {
        for(int i = 0;i<=top;i++)
        printf("%d ",arr[i]);
    }
    
}


int main(){

    int choice,data;
    do
    {
        printf("Stack Implementation:\n1)Push\n2)Pop\n3)Peek\n4)Dispaly\n5)Exit\nEnter your choice: ");
    scanf("%d",&choice);

    switch (choice)
    {
    case 1:
        printf("Enter data to be pushed: ");
        scanf("%d",&data);
        printf("\n");
        push(data);
        break;
    case 2:
        int elt=pop();
        if (elt!=-1)
        printf("Popped Element: %d\n",elt);
        break;
    case 3:
        if (peek()!=-1)
        printf("Element at the top of stack : %d\n",peek());
        break;
    case 4:
        printf("Stack Elements are: ");
        display();
        printf("\n");
        break;
    case 5:
        printf("Exiting...\n");
        break;
    }

    } while (choice!=5);
    

    return 0;
}