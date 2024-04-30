#include <stdio.h>
#define max 100
static int stack[max];
static int top = -1;
void push();
int pop();
void print();

void push(int item) {
  if (top == max - 1) {
    printf("Stack Overflow!");
  } else {
    top = top + 1;
    stack[top] = item;
  }
}

int pop() {
  int item;
  if (top == -1) {
    printf("Stack Underflow!");
  } else {
    item = stack[top];
    top = top - 1;
  }
  return item;
}

void print() {
  if (top == -1) {
    printf("Stack is Empty!");
  }
  for (int i = top; i >= 0; i--) {
    printf("%d ", stack[i]);
  }
}

int main() {
  print();
  char postfix[100];
  int n = 0;
  printf("Enter the Length of the postfix Expression:-\n");
  scanf("%d", &n);
  printf("Enter the PostFix Expression:-\n");
  for (int i = 0; i < n; i++) {
    scanf("%c ", &postfix[i]);
  }
  postfix[n] = ')';

  for (int i = 0; i < n + 1; i++) {
    char curr = postfix[i]; 
    if(curr != '+' && curr != '-' && curr != '*' && curr != '/' && curr != ')'){
      push((int)(curr - '0'));
    print();
    }else{
      if (curr == '+') {
      int a = pop();
      int b = pop();

      int res = b + a;
      push(res);
    } else if (curr == '-') {
      int a = pop();
      int b = pop();

      int res = b - a;
      push(res);
    } else if (curr == '*') {
      int a = pop();
      int b = pop();

      int res = b * a;
      push(res);
    } else if (curr == '/') {
      int a = pop();
      int b = pop();

      int res = b / a;
      push(res);
    } else if (curr == ')') {
      int ans = pop();
      printf("Result is: %d", ans);
      break;
    }
    }
  }
  return 0;
}
