public class TextEditor {
    private String text;
    private DoubleLinkedList<String> history, redo;

    public TextEditor()
    {
        this.text = "";
        this.history = new DoubleLinkedList<>();
        this.redo = new DoubleLinkedList<>();
        this.history.addInLast(text);
    }

    public void write(String text)
    {
        this.text += text;
        this.history.addInLast(this.text);
        if (!this.redo.isEmpty())
            redo.clear();
    }

    public String getText()
    {
        return this.text;
    }

    public void undo()
    {
        if (this.history.size() > 1)
        {
            String last = this.history.removeLast();
            this.redo.addInLast(last);
            this.text = this.history.get(this.history.size() - 1);
        }
    }

    public void redo()
    {
        if (!this.redo.isEmpty())
        {
            String last = this.redo.removeLast();
            this.history.addInLast(last);
            this.text = last;
        }
    }
}