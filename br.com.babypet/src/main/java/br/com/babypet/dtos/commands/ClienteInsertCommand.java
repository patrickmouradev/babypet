package br.com.babypet.dtos.commands;

public class ClienteInsertCommand {
  
  private String nome;
  private String cpf;
  private String email;
  
  public String getNome( ) {
    return nome;
  }
  
  public String getCpf( ) {
    return cpf;
  }
  
  public String getEmail( ) {
    return email;
  }
  
}