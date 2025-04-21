package app;

import Stack.StackOnQueue;

public class Main {
    public static void main(String[] args) {
        StackOnQueue stack = new StackOnQueue();

        stack.push(10);
        stack.push(20);

        System.out.println("Элемент на вершине: " + stack.top());

        System.out.println("Элемент на вершине, который будет удалён: " + stack.pop());

        System.out.println("Стек пуст? " + stack.empty());

        System.out.println("Элементы в стеке: " + stack.toString());
    }
}