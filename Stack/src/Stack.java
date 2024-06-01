public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    public void push(int element) {
        if (top < maxSize - 1) {
            stackArray[++top] = element;
        } else {
            System.out.println("Стек заполнен. Ошибыч: " + element);
        }
    }

    public int pop() {
        if (top >= 0) {
            return stackArray[top--];
        } else {
            System.out.println("Стек пуст.");
            return -1;
        }
    }

    public int peek() {
        if (top >= 0) {
            return stackArray[top];
        } else {
            System.out.println("Стек пуст.");
            return -1;
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}
