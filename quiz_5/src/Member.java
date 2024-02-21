public class Member<T> {
    private T data;
    private Member<T> nextMember;
    private Member<T> prevMember;

    public Member(T data) {
        this.data = data;
        this.nextMember = null;
        this.prevMember = null;
    }

    public void setData(T setData){
        this.data = setData;
    }

    public T getData() {
        return data;
    }

    public Member<T> getNext() {
        return nextMember;
    }

    public void setNext(Member<T> nextMember) {
        this.nextMember = nextMember;
    }

    public Member<T> getPrev() {
        return prevMember;
    }

    public void setPrev(Member<T> prevMember) {
        this.prevMember = prevMember;
    }
}