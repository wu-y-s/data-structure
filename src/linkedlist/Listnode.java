package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Listnode {

    private Node head;

    public Listnode() {
        this.head = null;
    }

    //前插
    public void addpre(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }

    }


    //后插
    public void add(int value) {
        Node node = new Node(value);
        Node n = head;
        if (head == null) {
            head = node;
        } else {
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }


    //删除所有匹配按值
    public void delAll(int value) {
        Node pre = head;
        if (pre.value == value) {
            head = head.next;
        }
        while (pre.next != null) {
            if (pre.next.value != value) {
                pre = pre.next;
            } else {
                pre.next = pre.next.next;
            }
        }
    }

    //删除第一个匹配按值
    public void del(int value) {
        Node pre = head;
        if (pre.value == value) {
            head = head.next;
            return;
        }
        while (pre.next != null) {
            if (pre.next.value != value) {
                pre = pre.next;
            } else {
                pre.next = pre.next.next;
                return;
            }
        }
    }


    //删除按位置
    public void delByIndex(int index) {
        Node node = head;
        int sum = 1;
        if (index == 0) {
            head = head.next;
            return;
        }
        while (sum < index && node.next != null) {
            sum++;
            node = node.next;
        }
        if (sum == index && node.next != null) {
            node.next = node.next.next;
        }

    }

    //修改所有匹配按值
    public boolean modifyAll(int oldValue, int newValue) {
        Node pre = head;
        while (pre != null) {
            if (pre.value == oldValue) {
                pre.value = newValue;
                return true;
            }
            pre = pre.next;
        }
        return false;
    }

    //修改第一个匹配按值
    public boolean modify(int oldValue, int newValue) {
        Node pre = head;
        while (pre != null) {
            if (pre.value == oldValue) {
                pre.value = newValue;
                return true;
            }
            pre = pre.next;
        }
        return false;
    }


    //修改按位置
    public boolean modifyByIndex(int index, int newValue) {
        Node node = head;
        if (index < 0 || index > count()) {
            return false;
        }
        while (index > 0) {
            node = node.next;
            index--;
        }
        node.value = newValue;
        return true;

    }


    //逆置
    public void reverse() {
        if (head != null) {
            Node a = head;
            Node b = head.next;
            a.next = null;
            while (b != null) {
                a = b;
                b = b.next;
                a.next = head;
                head = a;
            }
        }
    }

    //列出所有
    public List<Integer> query() {
        Node node = head;
        List<Integer> list = new ArrayList<>();
        while (node != null) {
            list.add(node.value);
            node = node.next;
        }
        return list;
    }

    //列出根据index
    public Integer query(int index) {
        Node n = head;
        if (index < 0) {
            return null;
        }
        while (index > 0) {
            if (n.next != null) {
                index--;
                n = n.next;
            } else {
                return null;
            }
        }
        return n.value;
    }

    //取出所有
    public List<Integer> get() {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.value);
            head = head.next;
        }
        return list;
    }

    //取出根据index
    public Integer getByIndex(int index) {
        Node n = head;
        Node m = new Node();
        if (index < 0) {
            return null;
        }
        while (index > 0) {
            if (n.next != null) {
                index--;
                m = n;
                n = n.next;
            } else {
                return null;
            }
        }
        m.next = n.next;
        return n.value;
    }

    //长度
    public int count() {
        int count = 0;
        Node node = head;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }

    public static class Node {

        public Node next;

        public int value;

        public Node() {
            next = null;
        }

        public Node(int v) {
            value = v;
        }

        public static void main(String[] args) {
            List<String> linkedList = new LinkedList<String>();
            Listnode listnode = new Listnode();
            listnode.add(1);
            listnode.add(2);
            listnode.add(3);
            listnode.add(4);
            listnode.add(5);
            listnode.reverse();
            System.out.println(listnode.query());
            System.out.println(listnode.query(1));
            System.out.println(listnode.query());
            System.out.println(listnode.getByIndex(1));
            System.out.println(listnode.query());
            System.out.println(listnode.count());


        }
    }


}
