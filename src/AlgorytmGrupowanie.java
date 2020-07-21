
public class AlgorytmGrupowanie {

	public static void main(String[] args) {
		int tablica[] = new int[32];
		tablica[0]=1;
		tablica[1]=1;
		tablica[2]=1;
		tablica[3]=2;
		tablica[4]=3;
		tablica[5]=1;
		tablica[6]=2;
		tablica[7]=3;
		tablica[8]=1;
		tablica[9]=2;
		tablica[10]=3;
		tablica[11]=1;
		tablica[12]=2;
		tablica[13]=1;
		tablica[14]=5;
		tablica[15]=6;
		tablica[16]=7;
		tablica[17]=4;
		tablica[18]=8;
		tablica[19]=8;
		tablica[20]=8;
		tablica[21]=8;
		tablica[22]=1;
		tablica[23]=2;
		tablica[24]=3;
		tablica[25]=1;
		tablica[26]=2;
		tablica[27]=3;
		tablica[28]=5;
		tablica[29]=6;
		tablica[30]=5;
		tablica[31]=6;
		
		
		int i=0,j=0;
		int roznica=0,ile=0;
		boolean flaga = false;
		boolean flaga2 = false;
		while(i<32){
			System.out.println("Badam indeks "+i);
			j=i+1;
			
			flaga=false;
			while(j<32){
				if(tablica[i]==tablica[j]){
					System.out.println("  - Znalazlem taka sama wartosc na pozycji "+j);
					roznica=j-i;
					ile=0;
					flaga=true;
					break;
				}
				j++;
			}
			
			
			if(flaga){
				System.out.println("  - Rozpoczynam sprawdzanie grupy");
				flaga2=true;
				while(flaga2){
					for(int k=0;k<roznica;k++){
						if((i+roznica+k)>31||tablica[i+k]!=tablica[i+roznica+k]){
							flaga2=false;
							System.out.println("    - Elementy niezgodne: "+(i+k)+", "+(i+roznica+k));
							break;
						}
						System.out.println("    - Elementy zgodne: "+(i+k)+", "+(i+roznica+k));
					}
					if(flaga2){
						ile++;
						System.out.println("  - Odnaleziono kopie, na razie jest ich "+(ile+1));
						i=i+roznica;
					}
					else{
						if(ile!=0)
							i=i+roznica;
						else
							i++;
						break;
					}
				}
			}
			else{
				System.out.println("  - Nie znalazlem wiecej takiej wartosci");
				i++;
			}
		}
	}
}
