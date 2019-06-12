/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

public class Aluno{ 
    protected int ID;
    protected String nome;
    protected String cpf;
    protected String cidade;
    protected int telefone;
    protected String matricula;

    public String getNome() {
        return nome;
    }
    public void setNome(String Nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCidade() {
        return cidade;
    }
    public void setSexo(String cidade) {
        this.cidade = cidade;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setSexo(int telefone) {
        this.telefone = telefone;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String Matricula) {
        this.matricula = Matricula;
    }

    
}
