package linkedlist;

import java.util.ArrayList;
import java.util.List;

public class Doublelinkedlist<E> {

    private DoubleNode<E> head;

    public Doublelinkedlist() {
        this.head = null;
    }

    //后插
    public void add(E obj) {
        DoubleNode doubleNode = new DoubleNode(obj);
        if (head == null) {
            head = doubleNode;
        } else {
            DoubleNode node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = doubleNode;
            doubleNode.pre = node;
        }
    }


    //前插
    public void addpre(E obj) {
        DoubleNode doubleNode = new DoubleNode(obj);
        if (head == null) {
            head = doubleNode;
        } else {
            doubleNode.next = head;
            head.pre = doubleNode;
            head = doubleNode;

        }
    }

    //列出所有
    public List<E> queryAll(){
        List<E> list = new ArrayList<>();
        while (head != null){
            System.out.println(head.value);
            list.add(head.value);
            head = head.next;
        }
        return list;
    }

    //逆置
    public void reverse(){
        if(head != null){
            DoubleNode x = head;
            DoubleNode y =head.next;
            x.next = null;
            while (y != null){
                head.pre = y;
                x.next = y.next;
                if(y.next != null){
                    y.next.pre = x;
                }
                y.next = head;
                y.pre = null;
                head = y;
                y = x.next;
            }

        }
    }

    public static void main(String[] args) {
        Doublelinkedlist<Integer> list = new Doublelinkedlist<Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.reverse();
        list.queryAll();
    }


    private static class DoubleNode<E> {

        transient DoubleNode<E> pre;

        transient DoubleNode<E> next;

        transient E value;

        public DoubleNode() {
            pre = null;
            next = null;
        }

        public DoubleNode(E value) {
            this.value = value;
            pre = null;
            next = null;
        }
    }


}


