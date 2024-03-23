// input : 53+ ----> 3 + 5

// 231*+9-  -------> 2(1*3)+9- --> 23+9- --> (3+2)9- --> 59- --> 9-5 = 4

#include <stdio.h>
#include <string.h>
#include <ctype.h>

#define Size 20

int arr[Size];
int top=-1;

int isFull(){
    if(top==Size-1)
    return 1;
    else 
    return 0;
}

int isEmpty(){
    if(top==-1)
    return 1;
    else
    return 0;
}

void push( int data){
    if(isFull())
    printf("Stack Overflow!\n");
    else
    arr[++top]=data;

}

int pop () {
    if(isEmpty())
    {
        printf("Stack underflow!\n");
        return -1;
    }
    else
    {
        return arr[top--];
    }
}

int main(){
    char str[40];
    scanf("%s",str);
    for(int i=0;i<strlen(str);i++)
    {
        char ch=str[i];
        if(isdigit(ch)) // isdigit() --> ctype.h library
        push(ch-'0');
        else
        {
            int num1=pop();
            int num2=pop();
            switch (ch)
            {
            case '*':
                push(num1*num2);
                break;
            
            case '+':
                push(num1+num2);
                break;
            
            case '-':
                push(num1-num2);
                break;
            case '/':
                push(num1/num2);
                break;
            case '%':
                push(num1%num2);
                break;
            }
        }
    }
    printf("The Given Postfix Expression is : %s\n",str);
    printf("The Postfix Evaluated value is : %d\n",pop());
    return 0;
}