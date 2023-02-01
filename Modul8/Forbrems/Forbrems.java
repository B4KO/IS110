package Forbrems;

public class Forbrems {
    private int _maxStyrke;
    private int _sisteService;
    private String _type;

    public Forbrems(int maxStyrke, int sisteService, String type) {
        _maxStyrke = maxStyrke;
        _sisteService = sisteService;
        _type = type;
    }

    public int styrkeNaa(int mengdeBrems) {
        return mengdeBrems * 1;
    }

}S