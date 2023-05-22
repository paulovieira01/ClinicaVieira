public enum Turno {
    DIURNO("diurno"),
    NOTURNO("noturno");

    private String descricao;

    Turno(String descricao){
        this.descricao = descricao;

    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}