package ch33_Interface.task33.task06;

public class EXEFile implements ReadFile {

    @Override
    public String open() {
        return "opening.exe";
    }

    @Override
    public String read() {
        return "reading.exe";
    }

    @Override
    public String save() {
        return "saving.exe";
    }

    @Override
    public String close() {
        return "closing.exe";
    }
}
