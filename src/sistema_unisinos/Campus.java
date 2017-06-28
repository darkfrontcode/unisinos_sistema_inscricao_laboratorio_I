package sistema_unisinos;

public class Campus {

    private int id;
    private String nome;
    private String descricao;

    public Campus(int id, String nome, String descricao)
    {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }

/* ===========================================
    -- Id
=========================================== */

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

/* ===========================================
    -- Nome
=========================================== */

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

/* ===========================================
    -- Descricao
=========================================== */

    public String getDescricao()
    {
        return descricao;
    }

    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }

/* ===========================================
    -- Info
=========================================== */

    public void info()
    {
        Log.out("=== Informações do Campus ===");
        Log.out("\t");
        Log.out("Id: " + id);
        Log.out("Nome: " + nome);
        Log.out("Descrição: " + descricao);
        Log.out("\t");
    }

}
