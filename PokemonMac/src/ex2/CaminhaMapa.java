package ex2;

import java.util.Random;

public class CaminhaMapa {
	public static void main(String[] args) {
		Ash Red = new Ash();
		Trash Blue = new Trash();
		Random x = new Random();
		int SelecionaPoke=x.nextInt(3);//Seleciona o pokemon selvagem
		Selvagem pokeSelvagem = new Selvagem(SelecionaPoke);
		int[][] mapa = new int[5][5]; //1=grama 2=tatame, tatame n�o possui pokemons
		boolean seMoveu1=false, seMoveu2=false;//Verifica se o personagem se moveu
		Batalha_Pokemon luta = new Batalha_Pokemon();
		int posicaoX1,posicaoY1,posicaoX2,posicaoY2;
		
		for (int i=0; i<5;i++){
			for (int j=0;j<5; j++){
				mapa[i][j]=x.nextInt(2)+1;
			}
		}
		mapa[0][0]=1;//Garante que tera ao menos um espa�o de grama
		posicaoX1= x.nextInt(5);
		posicaoY1= x.nextInt(5);
		posicaoX2= x.nextInt(5);
		posicaoY2= x.nextInt(5);
		
		while(Red.PokeVivos!=0 && Blue.PokeVivos!=0){
			int proximo1=x.nextInt(4);//0 baixo 1 esqueda 2 direita 3 cima
			int proximo2=x.nextInt(4);
			int encontrou1=x.nextInt(2);//Probabilidade de encontrar um pokemon
			int encontrou2=x.nextInt(2);
			
			
			//andando com Ash
			if(proximo1==0&&posicaoY1!=4)
			{
				posicaoY1++;
				System.out.println("Ash foi para baixo");
				seMoveu1=true;
			}
			else if(proximo1==1&&posicaoX1!=0)
			{
				posicaoX1--;
				System.out.println("Ash foi para a esquerda");
				seMoveu1=true;
			}
			else if(proximo1==2&&posicaoX1!=4)
			{
				posicaoX1++;
				System.out.println("Ash foi para a direita");
				seMoveu1=true;
			}
			else if(proximo1==3&&posicaoY1!=0)
			{
				posicaoY1--;
				System.out.println("Ash foi para cima");
				seMoveu1=true;
			}
			
			
			//Andando com Trash
			if(proximo2==0&&posicaoY2!=4)
			{
				posicaoY2++;
				System.out.println("Trash foi para baixo");
				seMoveu2=true;
			}
			
			else if(proximo2==1&&posicaoX2!=0)
			{
				posicaoX2--;
				System.out.println("Trash foi para a esquerda");
				seMoveu2=true;
			}
			else if(proximo2==2&&posicaoX2!=4)
			{
				posicaoX2++;
				System.out.println("Trash foi para a direita");
				seMoveu2=true;
			}
			else if(proximo2==3&&posicaoY2!=0)
			{
				posicaoY2--;
				System.out.println("Trash foi para cima");
				seMoveu2=true;
			}
			
			
			
			
			
			
			if(seMoveu1==true && seMoveu2==true)
			{
				if(mapa[posicaoY1][posicaoX1]==1)
				{
					if(encontrou1==1)
					{
						luta.Batalha(Red, pokeSelvagem);
						pokeSelvagem=new Selvagem(SelecionaPoke);
					}
				}
				if (mapa[posicaoY2][posicaoX2]==1)
				{
					if(encontrou2==1)
					{
						luta.Batalha2(Blue, pokeSelvagem);
					}	
				}
				if(posicaoX1==posicaoX2 && posicaoY1==posicaoY2)
				{
					if (mapa[posicaoX1][posicaoY1]== 2){
						luta.Batalha3(Red, Blue);
					}
						
				}
			}
			
			seMoveu1=false;
			seMoveu2=false;
			SelecionaPoke=x.nextInt(3);
			pokeSelvagem=new Selvagem(SelecionaPoke);
		}//fecha while
	}//fecha main
}//fecha classe
