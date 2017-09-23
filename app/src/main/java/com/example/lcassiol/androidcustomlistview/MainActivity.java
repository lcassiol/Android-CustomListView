package com.example.lcassiol.androidcustomlistview;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView futuramaPersons;

    private String[] persons = {"Philip J. Fry", "Turanga Leela", "Bender Bending", "Doctor Zoidberg", "Amy Wong", "Hubert J. Farnsworth", "Zap Branningan", "Scruffy"
            , "Kif Kroker", "Nibbler", "Hermes Conrad", "Mom"};

    private String[] descriptions = {
            "Fry era um entregador de pizza, e era sempre explorado pelo chefe e traído por sua namorada. Ao fazer uma entrega de pizza na virada para o ano 2000, Fry acidentalmente entra em uma câmara encubadora de criogenia que o congela por mil anos. Ao ser descongelado ele se vê em um local totalmente diferente e logo de cara se depara com Leela, uma ciclope órfã que tem a função de inserir chips de carreira em pessoas que são descongeladas. E ele descobre que possui um parente vivo, o seu 30 vezes neto professor Farnsworth. Fry se recusa a aceitar novamente o emprego de entregador e foge de Leela. Ao ver uma cabine e uma fila de pessoas pensa ser um telefone público, mas é uma Cabine de Suicídio (muito comum nas ruas da Nova Nova York), e é aí que conhece o robô Bender, que se torna seu melhor amigo. Fry, Bender e Leela passam a trabalhar na empresa de entregas Planeta Expresso, onde vivem as maiores aventuras no ano 3000, descobrindo e aprendendo com o futuro. Fry Nutre sentimentos fortes por Leela, apesar de ela, na maioria das vezes, não o corresponde, pelo menos nas primeiras temporadas. Ele também sobreviveu a um ataque cardíaco. Fry como é chamado na série, mora no guarda roupa de Bender que é incrivelmente grande com janelas e boa vista, porem no começo da série morava em seu trabalho.",
            "Leela é a capitã da Planeta Expresso, mas antes disso tinha a tarefa de dar chips de carreira às pessoas que descongelavam, e foi aí que conheceu Philip J. Fry. A garota domina as artes marciais e é sempre lembrada por Zapp Brannigan que certa vez tiveram uma \"aventura\". Leela é uma mulher decidida que sempre atrai alguns homens, como o seu verdadeiro amor, Philip J. Fry, mas sempre tenta renegar seu amor por ele, o tratando apenas como amigo, porém Fry sempre tenta provar seu amor e já foi capaz de mover estrelas. Leela sempre teve seu lado amoroso e agressivo, ela se mostra forte, e seu verdadeiro desejo é ter tido uma infância normal com seus pais do esgoto.",
            "Bender Bending Rodríguez é um personagem do desenho animado Futurama e apesar de não ser o personagem principal, é geralmente o mais lembrado pelos fãs da série. Ele é um robô que trabalha no Planeta Expresso e sua função é 'ficar sentado no sofá o dia todo sem fazer nada', porém em um episódio ele vira o cozinheiro da nave. [carece de fontes] Bender foi construído em Tijuana, no México e é o irmão gêmeo maligno de Flexo. Ele odeia todos os humanos apesar de ter uma grande afinidade com seu melhor amigo Fry e, diversas vezes, ignorou seu ódio por humanos com o objetivo de salvar sua vida. Tem, também, certa afinidade com Leela. [carece de fontes] Podemos fazer uma exceção aos outros membros da nave, porém nem por eles Bender parece ter muita afeição: num episódio de ficção, quando encontra o cabelo e o braço de Hermes dentro do triturador de lixo e percebe que foi Leela quem o matou, diz apenas 'Leela, eu estou chocado! Comida vai no triturador, cabelo e carne no lixo!' [carece de fontes] Bender é misantropo, mulherengo, alcoólatra, e cleptomaníaco, frequentemente rouba a carteira e jóias de outros personagens. [carece de fontes] Tem Hexacosioihexecontahexafobia, medo no número 666. [carece de fontes] Ele é um típico anti-herói. [carece de fontes] Foi dublado no Brasil inicialmente por Aldo César, mas após seu falecimento foi substituído por Silvio Navas. ",
            "Originário de Decapod 10, é um médico formado por correspondência com fisionomia de lagosta e especialista em humanos, apesar de ter pouquíssimo conhecimento de anatomia humana, que trabalha na Planet Express junto com Fry, Leela, Bender, Professor Farnsworth, Hermes, Amy & Scruffy. É detestado por Hermes que vê em Zoiberg o cúmulo da inutilidade e desordem. Dr Zoidberg também é uma combinação de várias criaturas do mar, pois produz tinta como uma lula ou polvo, cria joias como a ostra e possui garras semelhantes às dos caranguejos, é extremamente pobre se alimentando de lixo as vezes.",
            "Amy é estagiária da Planet Express. Humana nascida em Marte, é atrapalhada e promíscua. É herdeira de metade do planeta. Seus pais, que frequentemente a incomodam pedindo netos, pertencem à linhagem dos Wong — proprietários de todo o Hemisfério Oeste marciano desde a troca dele por um diamante gigantesco por volta de 2600. Amy teve um romance com Fry, e não vai muito com a cara de Leela, criticando-a e tirando chacota com ela frequentemente, porem a ajudou quando Leela sofreu com a perda de seu querido bichinho de estimação Nibler, assim como Leela ajudou quando Amy teve problemas em seu relacionamento. Amy é apaixonada por Kif e em alguns episódios eles chegam a ter um romance, sendo que em um deles Kif fica grávido, embora a verdadeira mãe dos girinos que terão de viver 25 anos em um lago do planeta Anfíbios 9 seja Leela. Mas mesmo assim Amy tem que suportar que Kif seja molenga, ciumento e capacho do capitão Zapp pelo o que mostra na 6 temporada que a relação dos dois vem sendo dificil. Isso pelas brigas em alguns episódios mostra que Amy não sente a mesma coisa com Kif o que sentia nas temporadas anteriores e isso acaba dando em um triângulo amoroso com ela, Bender e Kif. Embora Bender seja alcoólatra e mulherengo, Amy mesmo assim continua admirando Bender mas seus pais não admitem o relacionamento, mesmo assim isso não impede deles ficarem juntos, pois juntos protestam e criam uma lei a proposta infinidade que concebe o direito de humano e robôs ficarem juntos. Mas no final, Bender deixa Amy, por saber que eles teriam um casamento \"monogâmico\". Então Kif reaparece e eles acabam voltando, fazendo uma viagem de motocicleta.",
            "O Professor é um cientista louco e um homem senil, perturbado e imprevisível de longa idade, que é tanto um maníaco como um gênio. Ele tem um dom e uma paixão para a criação de dispositivos do Juízo Final, e é um perigo para si mesmo, seus funcionários, e ao universo em geral. Ele colocou,em um episódio, um universo paralelo em perigo com suas invenções. O professor trabalhou anteriormente para a Companhia de Robôs Amigáveis da Mamãe e atualmente da aulas na Universidade de Marte, porém ele gasta atualmente a maioria de seu tempo inventando dispositivos e chegando com missões suicidas para a sua tripulação.",
            "Zapp Brannigan é o general 25 estrelas e mais famoso e popular da Ordem Democrática dos Planetas (D.O.O.P), algo como a ONU do Universo do Ano 3000. Segundo Zapp Brannigan, ele é o mais elegante, sensual e galanteador da D.O.O.P é extremamente convencido, adora roupas feitas de veludo e que mostrem as pernas, tem um ajudante chamado Kif (uma sátira ao capitão Kirk, de Star Trek.) Tem uma paixão pela personagem Leela e foi capitão da nave espacial Titanic.",
            "Bom.. ele é o zelador",
            "É natural do planeta Anfíbios 9 e em sua espécie os machos também engravidam e sua reprodução é diferente, pois acasalam-se apenas em tocar a mão de alguém sem luvas quando está apaixonado. Kif engravidou uma vez e a progenitora é Leela, pois ela tocou sua mão acidentalmente, mas a mãe de fato é Amy, que é por quem ele se apaixonou. Ele deu à luz vários girinos que segundo a tradição de seu planeta, deviam nascer na mesma lagoa que seu clã e por lá viver 25 anos, quando enfim poderiam viver em terra firme. Por essa razão, seus filhos só foram vistos uma vez e só poderão ser levados à Terra no tempo certo. Não dá pra saber se no final ele ficou com Amy pois ela tambem é apaixonada por Bender e vice versa.",
            "Lord Nibbler é um Nibbloniano que durante maior parte do começo da série aparece disfarçado como um mascote doce e inocente de estimação da Leela. Na realidade ele é muito inteligente tendo vivido um pouco mais de 1000 anos e sendo o responsável por mandar Fry ao futuro para poder derrotar o exército dos cérebros mutantes. Tem um apetite voraz e suas fezes são capazes de servirem de combustível elas são pequenas esferas negras, porém pessam mais de 10 mil libras, segundo o Professor. A partir do filme O Grande Golpe de Bender é que ele revela sua inteligência passando mais tarde a fazer parte de sua tripulação.",
            "Hermes Conrad ou simplesmente Hermes é o burocrata e gerente da Planet Express. Paga as contas, notifica os clientes e assim por diante. É o burocrata nível 36 da Burocracia Central. É casado com LaBarbara Conrad e tem um filho de 13 anos, Dwight. Antes de ser burocrata, Hermes foi um esportista muito famoso de uma competição chamada Limbo, até participando da Olimpíada de 2980. Por dois motivos ele abandonou o esporte: um jovem fã que tentou imita-lo e quebrou a espinha e a ascensão do mais novo dominador de medalhas, Barbados Slim. Barbados também já foi casado com LaBarbara, que em momentos extremos, como quando Hermes perde literalmente a cabeça (O Grande Golpe de Bender), ela sempre volta com Slim. Depois de abandonar o Limbo atlético, ele foi para Tijuana para trabalhar na Fábrica Robótica de la Madre. Foi lá que Hermes virou o Inspetor #5 e foi o criador/autorizador do ainda bebê Bender, verificando que ele não possuía uma unidade de backup, liberou e confirmou sua inspeção deixando no interior do robô o seu cartão. Logo após esse momento, Hermes pediu demissão da fábrica. Hermes já tentou se suicidar após não estar pronto para a inspeção da burocrata nível 19, Morgan Proctor.",
            "Mom (no Brasil chamada de Mamãe ou Mãe), é uma personagem fictício da série de animação Futurama. É uma das principais antagonistas do programa (embora raramente aparece nos episódios), juntamente com Zapp Brannigan. Ao contrário de Brannigan, no entanto, ela é muito mais ameaçadora e maquiavélica.[1] É proprietária da MomCorp, a maior companhia do século XXXI, que detém o monopólio da fabricação e entrega de robôs. Em público, mantém a imagem de uma senhora gentil e amável ao usar termos estereotipamente antiquados e disfarçando-se em uma roupa mecânica que a torna gorda. Tem três filhos, Walt, Larry e Igner, que a veneram apesar de serem vítimas de constantes abusos. Mom foi incluída na lista de \"personagens de ficção mais ricos\" da Forbes em 2007. Ficou em 4° lugar, com um patrimônio estimado em 15.7 bilhões de dólares.[2] A MomCorp por sua vez entrou na lista de \"25 Maiores Empresas Fictícias\", com um lucro estimado em $291.8 bilhões.[3] A personagem é dublada originalmente por Tress MacNeille."};

    private int[] listIcons = {R.drawable.fry, R.drawable.leela, R.drawable.bender, R.drawable.doctorzoidberg, R.drawable.amywong,  R.drawable.professor, R.drawable.captain_zapp_brannigan,
    R.drawable.scruffy, R.drawable.kif, R.drawable.nibbler, R.drawable.hermes, R.drawable.momphoto};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        futuramaPersons = (ListView) findViewById(R.id.listVFuturamaPersons);

        ArrayAdapter<String> listAdapter = new ArrayAdapter<>(
                getApplication(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                persons
        );

        futuramaPersons.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent personInfoIntent = new Intent(getApplicationContext(), PersonInfo.class);
                personInfoIntent.putExtra("photo",listIcons[position]);
                personInfoIntent.putExtra("name",persons[position]);
                personInfoIntent.putExtra("description",descriptions[position]);

                startActivity(personInfoIntent);
            }
        });

        CustomListViewAdapter adapter;
        int i = 0;

        adapter = new CustomListViewAdapter(getApplicationContext(), R.layout.list_view_cel);

        for(String name : persons){
            DataProvider dataProvider = new DataProvider(listIcons[i], name, descriptions[i]);
            adapter.add(dataProvider);
            i++;
        }

        futuramaPersons.setAdapter(adapter);

    }


}
