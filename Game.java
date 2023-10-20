import java.util.Scanner;
public class Game {
	public static void main(String[] args) {
		Classes c = new Classes();
		Scanner sc = new Scanner(System.in);
		System.out.println("|---------BEM VINDO AO----------|");
		System.out.println(":::::::::  :::::::::   ::::::::  ");
		System.out.println(":+:    :+: :+:    :+: :+:    :+: ");
		System.out.println("+:+    +:+ +:+    +:+ +:+        ");
		System.out.println("+#++:++#:  +#++:++#+  :#:        ");
		System.out.println("+#+    +#+ +#+        +#+  ++#+# ");
		System.out.println("#+#    #+# #+#        #+#    #+# ");
		System.out.println("###    ### ###         ########  ");
		System.out.println("|-------------------------------|");
		System.out.println();
		System.out.print("QUANTOS PERSONAGENS VOCÊ DESEJA CRIAR?: ");
		int tam = sc.nextInt();
		sc.nextLine();
		Player[] p = new Player[tam];

		for(int i=0;i<p.length;i++){
			p[i] = new Player();
			System.out.println("================================================================================================================================================================================");
			System.out.print("BEM VINDO JOGADOR, POR FAVOR SELECIONE UM NICKNAME PARA SEU PERSONAGEM: ");
			p[i].setNick(sc.nextLine());
			System.out.println();
			System.out.print("MUITO BEM "+p[i].getNick().toUpperCase()+" , SELECIONE UM GÊNERO PARA SEU PERSONAGEM: ");
			p[i].setGenero(sc.nextLine());
			System.out.println();
			System.out.println("================================================================================================================================================================================");
			System.out.println("OK AGORA DEVEMOS ESCOLHER UMA RAÇA PARA SEU PERSONAGEM, ATENÇÃO ALGUMAS RAÇAS POSSUEM ALGUNS ATRIBUTOS UNICOS :D");
			System.out.println("SELECIONE UMA ENTRE ESSAS OPÇÕES:");
			System.out.println();
			System.out.println("[HUMANO]  [ELFO]  [ANÃO]  [DRACONICO]");
			System.out.println();
			System.out.println("HUMANO: Criaturas que possuem as mais variadas etnias, que diferem de região pra região de cada cenário. NENHUMA habilidade inata");
			System.out.println("ELFO: Os Elfos são criaturas mágicas, normalmente ligadas à beleza da vida e a arte. Possuem VISÃO NOTURNA como habilidade");
			System.out.println("ANÃO: Os anões são seres pequenos e robustos, rabugentos e teimosos. Normalmente ostentam uma longa barba, símbolo de poder, força, honra e orgulho racial. Possuem uma ALTA SAÚDE(HP) E RESISTENCIA FISICA");
			System.out.println("DRACONICO: Descendentes de dragões. São humanóides com escamas e cabeça de dragão. São orgulhosos e fieis aos Dragões. Possuem uma ALTA RESISTENCIA ELEMENTAR");
			System.out.println();
			System.out.print("SELECIONE(obs:sem acento no anão): ");
			String r = sc.nextLine();
			r = r.toUpperCase();
			switch(r) {
				case "HUMANO":
				p[i].setRaca("Humano");
				break;
				case "ELFO":
				p[i].setRaca("Elfo");
				break;
				case "ANAO":
				p[i].setRaca("Anao");
				break;
				case "DRACONICO":
				p[i].setRaca("Draconico");
				break;
				default:
				p[i].setRaca("Invalida ou Indefinida");
				break;
			}
			System.out.println();
			System.out.println("=================================================================================================================================================================================");
			System.out.println("MUITO BEM, AGORA DEVEMOS ESCOLHER UMA CLASSE PARA SEU PERSONAGEM, ASSIM ELE(A) PODERA DAR INICIO A SUA JORNADA");
			System.out.println();
			System.out.println("[GUERREIRO]  [RANGED]  [ARCANISTA]  [LADINO]  [SARCEDOTE]");
			System.out.println();
			System.out.println("GUERREIRO: Uma Classe corpo a corpo com bastante vitalidade e força, porem com pouca agilidade e dextreza ");
			System.out.println("RANGED: Uma Classe que utiliza arcos, bestas ou mosquetes. Tem foco dextreza porem tem baixa vitalidade");
			System.out.println("ARCANISTA: Uma Classe que utiliza magias e feitiços, suas principais armas são cajados e varinhas, tem altos status de inteligencia pouca vitalidade e força ");
			System.out.println("LADINO: Uma Classe furtiva, que utiliza adagas ou espadas curtas, suas caracteristicas são uma balanceamento entre dextreza e força mas com foco em agilidade");
			System.out.println("SARCEDOTE: Uma Classe ligado a poderes sagrados, possuem uma vasta habiladades de cura e melhorias de status, dominam magias de luz. Possuem altos status de fé");
			System.out.println();
			System.out.print("SELECIONE: ");
			String cl = sc.nextLine();
			cl = cl.toUpperCase();
			System.out.println();
			System.out.println("=================================================================================================================================================================================");
			System.out.println("AGORA SELECIONE UMA DIFICULDADE PARA SEU PERSONAGEM.");
			System.out.println();
			System.out.println("[FACIL]  [NORMAL]  [DIFICIL]");
			System.out.println();
			System.out.print("SELECIONE: ");
			p[i].setDif(sc.nextLine());
			System.out.println();
			System.out.println("=================================================================================================================================================================================");
			p[i].imprimirdados();
			System.out.println();
			switch(cl) {
				case "GUERREIRO":
					c.Guerreiro();
					break;
				case "RANGED":
					c.Ranged();
					break;
				case "ARCANISTA":
					c.Arcanista();
					break;
				case "LADINO":
					c.Ladino();
					break;
				case "SARCEDOTE":
					c.Sarcedote();
					break;
				default:
					System.out.println("Classe invalida!");
					break;
			}
			System.out.println("==================================================================================================================================================================================");
		}
	
	}
}