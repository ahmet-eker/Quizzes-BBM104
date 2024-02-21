public class MyStack<T> {
    private Member<T> head; // head Member
    private Member<T> tail; // tail Member

    public Member<T> getHead() {  // OOP
        return head;
    }

    public void setHead(Member<T> head) {
        this.head = head;
    }

    public Member<T> getTail() {
        return tail;
    }

    public void setTail(Member<T> tail) {
        this.tail = tail;
    }

    public static class Member<T> {
        T data;
        Member<T> prev;
        Member<T> next;

        public Member(T data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public void addToTail(T data) {
        Member<T> newMember = new Member<>(data);

        if (getHead() == null) {
            setHead(newMember);
            setTail(newMember);
        } else {
            getTail().next = newMember;
            newMember.prev = getTail();
            setTail(newMember);
        }

        getTail().next = getHead();
        getHead().prev = getTail();
    }

    public T removeFromHead() {
        if (getHead() == null) {
            throw new IllegalStateException("List is empty");
        }

        T data = getHead().data;

        if (getHead() == getTail()) {
            setHead(null);
            setTail(null);
        } else {
            Member<T> newHead = getHead().next;
            newHead.prev = getTail();
            getTail().next = newHead;
            setHead(newHead);
        }

        return data;
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();

        Member<T> current = getHead();
        while (current.next != getHead()) {
            sb.append(current.data);
            current = current.next;
        }
        sb.append(current.data);
        return sb.toString();
    }
}
