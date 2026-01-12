//LEGGERE LE ISTRUZIONI NEL FILE README.md

import java.util.Scanner;

// Classe principale, con metodo main
class Esercizio {

    //Input da tastiera
    static Scanner input = new Scanner(System.in);
    
    //Inserisce il simbolo x oppure o nella grigla di gioco in riga i e colonna j.
    //Se la mossa non è valida (pedina già presente o le coordinate sono fuori la griglia) allora ritorno falso.
    static boolean inserisciInGriglia(String[][] G, int i, int j, String s) {
		i--;
		j--;

		if (i >= 0 && i < 3 && j >= 0 && j < 3) {
			if (G[i][j].equals("-")) {
				G[i][j] = s;
				return true;
			}
		}
		return false;
	}


    //Azzero la griglia di gioco inserendo la stringa "-" in tutte le celle.
    static void azzeraGriglia(String[][] G, int n, int m) {
		for (int r = 0; r < n; r++) {
			for (int c = 0; c < m; c++) {
				G[r][c] = "-";
			}
		}
	}


    //Controlla se nella griglia c'è una vincita.
    // s può valore "O" oppure "X"
    static boolean controllaVincita(String[][] G, String s) {

		if (
			// righe
			(G[0][0].equals(s) && G[0][1].equals(s) && G[0][2].equals(s)) ||
			(G[1][0].equals(s) && G[1][1].equals(s) && G[1][2].equals(s)) ||
			(G[2][0].equals(s) && G[2][1].equals(s) && G[2][2].equals(s)) ||

			// colonne
			(G[0][0].equals(s) && G[1][0].equals(s) && G[2][0].equals(s)) ||
			(G[0][1].equals(s) && G[1][1].equals(s) && G[2][1].equals(s)) ||
			(G[0][2].equals(s) && G[1][2].equals(s) && G[2][2].equals(s)) ||

			// diagonali
			(G[0][0].equals(s) && G[1][1].equals(s) && G[2][2].equals(s)) ||
			(G[0][2].equals(s) && G[1][1].equals(s) && G[2][0].equals(s))
		) {
			return true;
		}

		return false;
	}


    //Conta quante caselle libere ci sono ancora.
    //Se non ci sono caselle libere e non si è vinto allora è un pareggio
    static int contaCaselleLibere(/scrivere qui i parametri richiesti dall'esercizio/ ) {
        //SCRIVERE QUI IL CODICE RICHIESTO DALL'ESERCIZIO
    }


    public static void main(String args[]) {
        //SCRIVERE QUI IL CODICE RICHIESTO DALL'ESERCIZIO  
    }
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md