package it.virna.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.Table;




//crezione tabella database
@Entity
@Table(name = "utente")

	
public class SignUpForm {
	
	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
			.createEntityManagerFactory("gaetanoMysql");
	@Id
	@Column(name = "id", unique = true)
	private int id;
	@Column(name = "Nome", nullable = false)
	private String Nome;
	
	
	@Column(name = "Cognome", nullable = false)
	private String Cognome;
	@Column(name = "emailId", nullable = false)
	private String emailId;
	
	@Column(name = "Messaggio", nullable = false)
	private String Messaggio;
	
	
	public SignUpForm(String nome, String cognome, String emailId, String messaggio) {
		super();
		this.Nome = nome;
		this.Cognome = cognome;
		this.emailId = emailId;
		this.Messaggio = messaggio;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		this.Nome = nome;
	}
	public String getCognome() {
		return Cognome;
	}
	public void setCognome(String cognome) {
		this.Cognome = cognome;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMessaggio() {
		return Messaggio;
	}
	public void setMessaggio(String messaggio) {
		this.Messaggio = messaggio;
	}
	@Override
	public String toString() {
		return "SignUpForm [Nome=" + Nome + ", Cognome=" + Cognome + ", emailId=" + emailId + ", Messaggio=" + Messaggio
				+ "]";
	}
	public void create(SignUpForm signUpForm) {
		EntityManager manager = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction transaction = null;

		try {

			transaction = manager.getTransaction();

			transaction.begin();

			
			manager.persist(signUpForm);
			transaction.commit();
			
		} catch (Exception ex) {

			if (transaction != null) {
				transaction.rollback();
			}

			ex.printStackTrace();
		} finally {

			manager.close();
		}
	}

	
 // default Construct




}
