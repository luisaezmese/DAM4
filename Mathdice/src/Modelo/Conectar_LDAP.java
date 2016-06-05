package Modelo;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;

public class Conectar_LDAP {
	
	public Conectar_LDAP() {

		Hashtable<String, String> env = new Hashtable<String, String>();
		env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
		env.put(Context.SECURITY_AUTHENTICATION, "simple");
		env.put(Context.PROVIDER_URL, "ldap://10.2.72.182");
		
		//Rellenamos con el usuario/dominio y password
		env.put(Context.SECURITY_PRINCIPAL, "Administrador@sistemaswin2012.com");
		env.put(Context.SECURITY_CREDENTIALS, "7abc121,I");

		DirContext ctx;

		try {
			// Authenticate the logon user
			ctx = new InitialDirContext(env);
			System.out.println("El usuario se ha autenticado correctamente");			
			ctx.close();

		} catch (NamingException ex) {
			System.out.println("Ha habido un error en la autenticación");
		}
			

	}

}