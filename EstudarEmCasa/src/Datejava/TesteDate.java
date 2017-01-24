package Datejava;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.zip.DataFormatException;

@SuppressWarnings({"unused", "deprecation"})

public class TesteDate {
	
	public static void main(String[] args) throws ParseException, InterruptedException {
		
		Date hoje = new Date(1485292925339L);
		
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		
		Date aniversario = new Date(1983,03, 07);
		
		Date ontem = formatador.parse("23/01/2017");
		
		System.out.println(hoje.getTime());
		System.out.println(formatador.format(ontem));
		
		Calendar c =  Calendar.getInstance();
		
		c.add(Calendar.DAY_OF_MONTH, -4);
		c.set(Calendar.MONTH, 12);
		c.set(Calendar.YEAR, 1980);
		
		System.out.println(formatador.format(c.getTime()));
		
		Date agora = new Date();
		Long a = agora.getTime();
		Thread.sleep(3000);
		agora = new Date();
		Long b = agora.getTime();
		System.out.println((b - a)/ 1000);
		
		
		
	}

}
