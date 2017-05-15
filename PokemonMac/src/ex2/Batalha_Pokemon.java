package ex2;

abstract class Pokemon
{
	String NomePoke;
	double HP;
	int Tipo;//Tipo 1= Dragao,2=Fogo, 3=gelo, agua=4, eletrico = 5, psiquico=6, fantasma=7, dark = 8, normal=9,lutador = 10;
	int Fraquesa;
	int UsouCura;
	double Ataque1;
	double Ataque2;
	double Ataque3;
	double Ataque4;
	String NoAtaque1;
	String NoAtaque2;
	String NoAtaque3;
	String NoAtaque4;
}
class Blastoise extends Pokemon
{
	public Blastoise()
	{
		this.NomePoke="Blastoise";
		this.HP=362.0;
		this.Tipo=4;
		this.Fraquesa=5;
		this.NoAtaque1="Hydro Pump";
		this.NoAtaque2="Aqua Tail";
		this.NoAtaque3="Water Pulse";
		this.NoAtaque4="Bubble";
		this.Ataque1=110.0;
		this.Ataque2=90.0;
		this.Ataque3=60.0;
		this.Ataque4=40.0;
	}
}
class Dragonite extends Pokemon
{
	public Dragonite()
	{
		this.NomePoke="Dragonite";
		this.HP=386.0;
		this.Tipo=1;
		this.Fraquesa=3;
		this.NoAtaque1="Outrage";
		this.NoAtaque2="Dragon Rush";
		this.NoAtaque3="Dragon Tail";
		this.NoAtaque4="Twister";
		this.Ataque1=120.0;
		this.Ataque2=100.0;
		this.Ataque3=60.0;
		this.Ataque4=40.0;
	}
}
class Charizard extends Pokemon
{
	public Charizard(){
		this.NomePoke="Charizard";
		UsouCura=0;
		this.HP=360.0;
		this.Tipo=2;
		this.Fraquesa=4;
		this.NoAtaque1="Flare Blitz";
		this.NoAtaque2="Heat Wave";
		this.NoAtaque3="Inferno";
		this.NoAtaque4="Flamethrower";
		this.Ataque1=120.0;
		this.Ataque2=95.0;
		this.Ataque3=100.0;
		this.Ataque4=90.0;
	}
}
class Lapras extends Pokemon
{
	public Lapras(){
		this.NomePoke="Lapras";
		this.HP=464.0;
		this.Tipo=3;
		this.Fraquesa = 2;
		this.NoAtaque1="Blizzard";
		this.NoAtaque2="Frost Breath";
		this.NoAtaque3="Ice Beam";
		this.NoAtaque4="Freeze-Dry";
		this.Ataque1=110.0;
		this.Ataque2=60.0;
		this.Ataque3=90.0;
		this.Ataque4=70.0;
	}
}
class Gyarados extends Pokemon
{
	public Gyarados(){
		this.NomePoke="Gyarados";
		this.HP=394.0;
		this.Tipo=4;
		this.Fraquesa =5;
		this.NoAtaque1="Hydro Pump";
		this.NoAtaque2="Aqua Tail";
		this.NoAtaque3="Scald";
		this.NoAtaque4="Surf";
		this.Ataque1=110.0;
		this.Ataque2=90.0;
		this.Ataque3=80.0;
		this.Ataque4=90.0;
	}
}
class Alakazam extends Pokemon
{
	public Alakazam(){
		this.NomePoke="Alakazam";
		this.HP=314.0;
		this.Tipo=6;
		this.Fraquesa =7;
		this.NoAtaque1="Future Sight";
		this.NoAtaque2="Psychic";
		this.NoAtaque3="Psycho Cut";
		this.NoAtaque4="Psybeam";
		this.Ataque1=120.0;
		this.Ataque2=90.0;
		this.Ataque3=70.0;
		this.Ataque4=65.0;
	}
}
class Gengar extends Pokemon
{
	public Gengar(){
		this.NomePoke="Gengar";
		this.HP=324.0;
		this.Tipo=7;
		this.Fraquesa =8;
		this.NoAtaque1="Hex";
		this.NoAtaque2="Shadow Ball";
		this.NoAtaque3="Shadow Punch";
		this.NoAtaque4="Shadow Claw";
		this.Ataque1=65.0;
		this.Ataque2=80.0;
		this.Ataque3=60.0;
		this.Ataque4=70.0;
	}
}
class Snorlax extends Pokemon
{
	public Snorlax(){
		this.NomePoke="Snorlax";
		UsouCura=0;
		this.HP=524.0;
		this.Tipo=9;
		this.Fraquesa =10;
		this.NoAtaque1="Giga Impact";
		this.NoAtaque2="Hyper Beam";
		this.NoAtaque3="Facade";
		this.NoAtaque4="Chip Away";
		this.Ataque1=150.0;
		this.Ataque2=150.0;
		this.Ataque3=70.0;
		this.Ataque4=70.0;
	}
}
class Machamp extends Pokemon
{
	public Machamp(){
		this.NomePoke="Machamp";
		this.HP=384.0;
		this.Tipo=10;
		this.Fraquesa =6;
		this.NoAtaque1="Dynamic Punch";
		this.NoAtaque2="Cross Chop";
		this.NoAtaque3="Submission";
		this.NoAtaque4="Vital Throw";
		this.Ataque1=100.0;
		this.Ataque2=100.0;
		this.Ataque3=80.0;
		this.Ataque4=70.0;
	}
}
class Arcanine extends Pokemon
{
	public Arcanine(){
		this.NomePoke="Arcanine";
		this.HP=384.0;
		this.Tipo=2;
		this.Fraquesa =4;
		this.NoAtaque1="Overheat";
		this.NoAtaque2="Fire Blast";
		this.NoAtaque3="Flamethrower";
		this.NoAtaque4="Fire Fang";
		this.Ataque1=130.0;
		this.Ataque2=110.0;
		this.Ataque3=90.0;
		this.Ataque4=65.0;
	}
}
class Mewtwo extends Pokemon
{
	public Mewtwo(){
		this.NomePoke="Mewtwo";
		this.HP=416.0;
		this.Tipo=6;
		this.Fraquesa =7;
		this.NoAtaque1="Future Sight";
		this.NoAtaque2="Psystrike";
		this.NoAtaque3="Dream Eater";
		this.NoAtaque4="Psychic";
		this.Ataque1=120.0;
		this.Ataque2=100.0;
		this.Ataque3=100.0;
		this.Ataque4=90.0;
	}
}
abstract class Treinador
{
	boolean fugiu;
	String NomeTreinador;
	int QuantPoke;
	int PokeVivos;
	Pokemon []Vet=new Pokemon[6];
	abstract int ação(int j);
}
class Ash extends Treinador
{
	boolean fugiu;
	public Ash(){
		this.NomeTreinador="Ash";
		this.fugiu=false;
		this.QuantPoke=5;
		this.PokeVivos=5;
		this.Vet[0]=new Charizard();
		this.Vet[1]=new Snorlax();
		this.Vet[2]=new Lapras();
		this.Vet[3]=new Arcanine();
		this.Vet[4]=new Mewtwo();
		}
	public int ação(int j)
	{
		if(Vet[0].HP<100&&Vet[0].HP>0.0&&Vet[0].UsouCura==0)
		{
			return 6;//Usa Cura
		}
		else if(PokeVivos<3&&Vet[0].HP<50)
		{
			return 7;//Troca
		}
		else//Ataca
		{
			if(j==1)
			{
			    return 1;	
			}
			else if(j==2)
			{
				return 2;
			}
			else if(j==3)
			{
				return 3;
			}
			else
			{
				return 4;
			}
		}
			
	}
}
class Selvagem extends Treinador
{
	public Selvagem(int j){
		this.NomeTreinador="Pokemon selvagem";
		this.QuantPoke=1;
		this.fugiu=false;
		this.PokeVivos=1;
		if(j==0){
		this.Vet[0]=new Blastoise();
		}
		else if(j==1)
		{
			this.Vet[0]=new Gengar();
		}
		else
		{
			this.Vet[0]=new Gyarados();
		}
		}
	public int ação(int j)
	{
		if(j==1)
		{
		    return 1;	
		}
		else if(j==2)
		{
			return 2;
		}
		else if(j==3)
		{
			return 3;
		}
		else
		{
			return 4;
		}
	}
}
class Trash extends Treinador
{
	public Trash(){
		this.NomeTreinador="Trash";
		this.QuantPoke=5;
		this.fugiu=false;
		this.PokeVivos=5;
		this.Vet[0]=new Dragonite();
		this.Vet[1]=new Gengar();
		this.Vet[2]=new Gyarados();
		this.Vet[3]=new Alakazam();
		this.Vet[4]=new Machamp();
		}
	public int ação(int j)
	{
		if(j==1)
		{
		    return 1;	
		}
		else if(j==2)
		{
			return 2;
		}
		else if(j==3)
		{
			return 3;
		}
		else
		{
			return 4;
		}
	}

}
class Batalha{
	static int i=0;
	static int j=0;
	String Vencedor;
	boolean Acabou;
	Treinador treinadorA;
	Treinador treinadorB;
	Pokemon PokemonA;
	Pokemon PokemonB;
	
	public Batalha(Treinador a, Treinador b){
		this.treinadorA=a;
		this.treinadorB=b;
		this.PokemonA= a.Vet[i];
		this.PokemonB= b.Vet[j];
		
	}
	public boolean cura(Ash a)
	{
		System.out.println(a.NomeTreinador+" usou cura");
		a.Vet[0].HP+=200;
		a.Vet[0].UsouCura=1;
		return false;
	}
	public boolean Foge(Ash a)
	{
		System.out.println("Ash fugiu da batalha");
		a.fugiu=true;
		return true;
	}
	public boolean Troca(Treinador a)
	{
		int b=0;
		boolean t=false;
		while(t==false)
		{
			b++;
			if(a.Vet[b].HP>0.0)
			{
				t=true;
			}
			if(b==4)
			{
				t=true;
			}
		}
		if(a.PokeVivos!=0)
		{
		System.out.println(a.NomeTreinador+": Volte "+a.Vet[0].NomePoke+"!!");
		Pokemon aux=a.Vet[0];
		a.Vet[0]=a.Vet[b];
		a.Vet[b]=aux;
		System.out.println(a.NomeTreinador+": Vá "+a.Vet[0].NomePoke+"!!");
		return false;
		}
		else
		{
			return true;
		}
	}
	public boolean Ataque1(Treinador a,Treinador b)
	{
		int fator;//Sistema de fraquesa, fator que multiplica o ataque
		if(b.Vet[0].Fraquesa==a.Vet[0].Tipo)
		{
			fator=2;
		}
		else
			fator=1;
		System.out.println(a.Vet[0].NomePoke+" usou "+a.Vet[0].NoAtaque1);
		if(a.Vet[0].Ataque1*fator<b.Vet[0].HP)
		{
			b.Vet[0].HP-=a.Vet[0].Ataque1*fator;
			return false;
		}
		else
		{
			System.out.println(b.Vet[0].NomePoke+" foi nocauteado");
			b.Vet[0].HP=0.0;
			int c=0;
			boolean t=false;
			b.PokeVivos--;
			if(b.PokeVivos==0)
			{
				return true;
			}
			while(t==false)
			{
				c++;
				
				if(b.Vet[c].HP>0.0)
				{
					t=true;
				}
			}
			System.out.println(b.NomeTreinador+": Volte "+b.Vet[0].NomePoke+"!!");
			Pokemon aux=b.Vet[0];
			b.Vet[0]=b.Vet[c];
			b.Vet[c]=aux;
			System.out.println(b.NomeTreinador+": Vá "+b.Vet[0].NomePoke+"!!");
			return false;
		}
	}
	public boolean Ataque2(Treinador a,Treinador b)
	{
		int fator;
		if(b.Vet[0].Fraquesa==a.Vet[0].Tipo)
		{
			fator=2;
		}
		else
			fator=1;
		System.out.println(a.Vet[0].NomePoke+" usou "+a.Vet[0].NoAtaque2);
		if(a.Vet[0].Ataque2*fator<b.Vet[0].HP)
		{
			b.Vet[0].HP-=a.Vet[0].Ataque2*fator;
			return false;
		}
		else
		{
			System.out.println(b.Vet[0].NomePoke+" foi nocauteado");
			b.Vet[0].HP=0.0;
			int c=0;
			b.PokeVivos--;
			if(b.PokeVivos==0)
			{
				return true;
			}
			boolean t=false;
			while(t==false)
			{
				c++;
				if(b.Vet[c].HP>0.0)
				{
					t=true;
				}
			}
			
			System.out.println(b.NomeTreinador+": Volte "+b.Vet[0].NomePoke+"!!");
			Pokemon aux=b.Vet[0];
			b.Vet[0]=b.Vet[c];
			b.Vet[c]=aux;
			System.out.println(b.NomeTreinador+": Vá "+b.Vet[0].NomePoke+"!!");
			return false;
		}
	}
	public boolean Ataque3(Treinador a,Treinador b)
	{
		int fator;
		if(b.Vet[0].Fraquesa==a.Vet[0].Tipo)
		{
			fator=2;
		}
		else
			fator=1;
		System.out.println(a.Vet[0].NomePoke+" usou "+a.Vet[0].NoAtaque3);
		if(a.Vet[0].Ataque3*fator<b.Vet[0].HP)
		{
			b.Vet[0].HP-=a.Vet[0].Ataque3*fator;
			return false;
		}
		else
		{
			System.out.println(b.Vet[0].NomePoke+" foi nocauteado");
			b.Vet[0].HP=0.0;
			int c=0;
			boolean t=false;
			b.PokeVivos--;
			if(b.PokeVivos==0)
			{
				return true;
			}
			while(t==false)
			{
				c++;
				if(b.Vet[c].HP>0.0)
				{
					t=true;
				}
			}
			System.out.println(b.NomeTreinador+": Volte "+b.Vet[0].NomePoke+"!!");
			Pokemon aux=b.Vet[0];
			b.Vet[0]=b.Vet[c];
			b.Vet[c]=aux;
			System.out.println(b.NomeTreinador+": Vá "+b.Vet[0].NomePoke+"!!");
			return false;
		}
	}
	public boolean Ataque4(Treinador a,Treinador b)
	{
		int fator;
		if(b.Vet[0].Fraquesa==a.Vet[0].Tipo)
		{
			fator=2;
		}
		else
			fator=1;
		System.out.println(a.Vet[0].NomePoke+" usou "+a.Vet[0].NoAtaque4);
		if(a.Vet[0].Ataque4*fator<b.Vet[0].HP)
		{
			b.Vet[0].HP-=a.Vet[0].Ataque4*fator;
			return false;
		}
		else
		{
			System.out.println(b.Vet[0].NomePoke+" foi nocauteado");
			b.Vet[0].HP=0.0;
			int c=0;
			boolean t=false;
			b.PokeVivos--;
			if(b.PokeVivos==0)
			{
				return true;
			}
			while(t==false)
			{
				c++;
				if(b.Vet[c].HP>0.0)
				{
					t=true;
				}
			}
			System.out.println(b.NomeTreinador+": Volte "+b.Vet[0].NomePoke+"!!");
			Pokemon aux=b.Vet[0];
			b.Vet[0]=b.Vet[c];
			b.Vet[c]=aux;
			System.out.println(b.NomeTreinador+": Vá "+b.Vet[0].NomePoke+"!!");
			return false;
		}
	}
	public String description(Treinador a,Treinador b){
		return a.NomeTreinador +" inicia batalha com o "+b.NomeTreinador+" "+b.Vet[0].NomePoke;
	}

}
class action
{
	public action()
	{
	}
	public boolean AshAção(int j,Ash a,Treinador b)
	{
		boolean acabou;
		int x=a.ação(j);
		Batalha bat=new Batalha(a,b);
		if(x==5)
		{
			acabou=bat.Foge(a);
		}
		else if(x==6)
		{
			acabou=bat.cura(a);
		}
		else if(x==7)
		{
			acabou=bat.Troca(a);
		}
		else if(x==1)
		{
			acabou=bat.Ataque1(a, b);
		}
		else if(x==2)
		{
			acabou=bat.Ataque2(a, b);
		}
		else if(x==3)
		{
			acabou=bat.Ataque3(a, b);
		}
		else
		{
			acabou=bat.Ataque4(a, b);
		}
		return acabou;
	}
	public boolean TrashAção(int j,Treinador a,Trash b)
	{
		boolean acabou;
		int x=b.ação(j);
		Batalha bat=new Batalha(a,b);
		if(x==1)
		{
			acabou=bat.Ataque1(b,a);
		}
		else if(x==2)
		{
			acabou=bat.Ataque2(b,a);
		}
		else if(x==3)
		{
			acabou=bat.Ataque3(b,a);
		}
		else
		{
			acabou=bat.Ataque4(b,a);
		}
		return acabou;
	}
	public boolean SelvagemAção(int j,Treinador a,Selvagem b)
	{
		boolean acabou;
		int x=b.ação(j);
		Batalha bat=new Batalha(a,b);
		if(x==1)
		{
			acabou=bat.Ataque1(b,a);
		}
		else if(x==2)
		{
			acabou=bat.Ataque2(b,a);
		}
		else if(x==3)
		{
			acabou=bat.Ataque3(b,a);
		}
		else
		{
			acabou=bat.Ataque4(b,a);
		}
		return acabou;
	}
	public String vencedor(Treinador a,Treinador b)
	{
		if(a.fugiu==true)
		{
			return b.NomeTreinador;
		}
		else if(a.PokeVivos==0)
		{
			return b.NomeTreinador;
		}
		else
		{
			return a.NomeTreinador;
		}
	}
}
public class Batalha_Pokemon
{
	public Batalha_Pokemon()
	{
	}
	public void Batalha(Ash Red,Selvagem Blue)
	{
		action act=new action();
		int j=1;
		int Turno=0;
		Batalha bat=new Batalha(Red, Blue);
		System.out.println(bat.description(Red, Blue));
		boolean acabou=false;
		System.out.println(Red.NomeTreinador+": Vá "+Red.Vet[0].NomePoke+"!!");
		while(acabou==false)
		{
			if(Turno%2==0&&Red.PokeVivos!=0)
			{
			    acabou=act.AshAção(j, Red, Blue);
			}
			else
			{
				acabou=act.SelvagemAção(j, Red, Blue);
			}
			j++;
			j=j%5;
			Turno++;
		}
		System.out.println("O vencedor é "+act.vencedor(Red, Blue));
	}
	public void Batalha2(Trash Red,Selvagem Blue)
	{
		action act=new action();
		int j=1;
		int Turno=0;
		Batalha bat=new Batalha(Red, Blue);
		System.out.println(bat.description(Red, Blue));
		boolean acabou=false;
		System.out.println(Red.NomeTreinador+": Vá "+Red.Vet[0].NomePoke+"!!");
		while(acabou==false)
		{
			if(Turno%2==0&&Red.PokeVivos!=0)
			{
			    acabou=act.TrashAção(j, Blue, Red);
			}
			else
			{
				acabou=act.SelvagemAção(j, Red, Blue);
			}
			j++;
			j=j%5;
			Turno++;
		}
		System.out.println("O vencedor é "+act.vencedor(Red, Blue));
	}
	public void Batalha3(Ash Red,Trash Blue)
	{
		action act=new action();
		int j=1;
		int Turno=0;
		Batalha bat=new Batalha(Red, Blue);
		System.out.println(bat.description(Red, Blue));
		boolean acabou=false;
		System.out.println(Red.NomeTreinador+": Vá "+Red.Vet[0].NomePoke+"!!");
		while(acabou==false)
		{
			if(Turno%2==0&&Red.PokeVivos!=0)
			{
			    acabou=act.AshAção(j, Red, Blue);
			}
			else
			{
				acabou=act.TrashAção(j, Red, Blue);
			}
			j++;
			j=j%5;
			Turno++;
		}
		System.out.println("O vencedor é "+act.vencedor(Red, Blue));
	}
}
	
