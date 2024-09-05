package com.foxnks.recyclerviewexample1.data;

import android.content.Context;

import com.foxnks.recyclerviewexample1.R;
import com.foxnks.recyclerviewexample1.model.Movie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovieData {

    private Context context;

    public MovieData(Context context) {
        this.context = context;
    }


    public ArrayList<Movie> insertData() {
        ArrayList<Movie> movieList = new ArrayList<>();
        Movie movie1 = new Movie("Dr. No"
                , R.drawable.no
                ,context.getString(R.string.drNo_description)
                ,context.getString(R.string.drNo_worldPremiere)
                ,1962
                ,"Sean Connery, Ursula Andress, Joseph Wiseman, Bernard Lee, Jack Lord, Anthony Dawson, Lois Maxwell, John Kitzmiller, Zena Marshall, Eunice Gayson, " +
                    "Peter Burton, Yvonne Shima, Michel Mok, Marguerite LeWars");

        Movie movie2 = new Movie("From Russia with Love"
                , R.drawable.russia_with_love
                ,context.getString(R.string.fromRussiaWithLove_description)
                ,context.getString(R.string.fromRussiaWithLove_worldPremiere)
                ,1963
                ,"Sean Connery, Daniela Bianchi, Pedro Armendáriz, Lotte Lenya, Robert Shaw, Bernard Lee, Eunice Gayson, Walter Gotell," +
                    " Francis De Wolff, Lois Maxwell, Aliza Gur, Martine Beswicke, Vladek Shyebal, Anthony Dawson, Desmond Llewelyn, Leila");

        Movie movie3 = new Movie("Goldfinger"
                , R.drawable.goldfinger
                , context.getString(R.string.goldfinger_description)
                , context.getString(R.string.goldfinger_worldPremiere)
                ,1964
                ,"Sean Connery, Honor Blackman, Gert Fröbe, Shirley Eaton, Tania Mallet, Harold Sakata, Bernard Lee, " +
                    "Martin Benson, Cec Linder, Lois Maxwell, Desmond Llewelyn");

        Movie movie4 = new Movie("Thunderball"
                , R.drawable.thunderball
                , context.getString(R.string.thunderball_description)
                , context.getString(R.string.thunderball_worldPremiere)
                ,1965
                ,"Sean Connery, Claudine Auger, Adolfo Celi, Luciana Paluzzi, Rik Van Nutter, Guy Doleman, Molly Peters, " +
                    "Martine Beswick, Bernard Lee, Desmond Llewelyn, Lois Maxwell");

        Movie movie5 = new Movie("You Only Live Twice"
                , R.drawable.only_live_twice
                ,context.getString(R.string.yonlyLiveTwice_description)
                , context.getString(R.string.yonlyLiveTwice_worldPremiere)
                ,1967
                ,"Sean Connery, Akiko Wakabayashi, Mie Hama, Tetsuro Tamba, Teru Shimada, Karin Dor, Donald Pleasence, " +
                    "Bernard Lee, Desmond Llewelyn, Lois Maxwell, Charles Gray");

        Movie movie6 = new Movie("On Her Majesty's Secret Service"
                , R.drawable.secret_service
                ,context.getString(R.string.onMajestrySS_description)
                ,context.getString(R.string.onMajestrySS_worldPremiere)
                ,1969
                ,"George Lazenby, Diana Rigg, Telly Savalas, Gabriele Ferzetti, Ilse Steppat, Angela Scoular, Lois Maxwell, Catherina Von Schell, George Baker, " +
                    "Bernard Lee, Bernard Horsfall, Desmond Llewelyn, Yuri Borienko");

        Movie movie7 = new Movie("Diamonds Are Forever"
                , R.drawable.diamonds_are_forever
                ,context.getString(R.string.diamondsForever_description)
                ,context.getString(R.string.diamondsForever_worldPremiere)
                ,1971
                ,"Sean Connery, Jill St. John, Charles Gray, Lana Wood, Jimmy Dean, Bruce Cabot, Putter Smith, " +
                    "Bruce Glover, Norman Burton, Bernard Lee, Desmond Llewelyn, Lois Maxwell");

        Movie movie8 = new Movie("Live and Let Die"
                , R.drawable.live_and_letdie
                ,context.getString(R.string.liveAndletDie_description)
                ,context.getString(R.string.liveAndletDie_worldPremiere)
                ,1973
                ,"Roger Moore, Yaphet Kotto, Jane Seymour, Clifton James, Julius W. Harris, Geoffrey Holder, David Hedison, Gloria Hendry, Bernard Lee, " +
                    "Lois Maxwell, Tommy Lane, Earl Jolly Brown, Roy Stewart, Lon Statton");

        Movie movie9 = new Movie("The Man with the Golden Gun"
                , R.drawable.man_golden_gun
                ,context.getString(R.string.manGoldenGun_description)
                ,context.getString(R.string.manGoldenGun_worldPremiere)
                ,1974
                ,"Roger Moore, Christopher Lee, Britt Ekland, Maud Adams, Hervé Villechaize, Clifton James, Richard Loo, Soon-Taik Oh, Marc Lawrence, Bernard Lee, Lois Maxwell, " +
                    "Marne Maitland, Desmond Llewelyn, James Cossins, Chan Yiu Lam, Carmen Sautoy, Gerald James, Michael Osborne, Michael Fleming");

        Movie movie10 = new Movie("The Spy Who Loved Me"
                , R.drawable.spy_who_loves_me
                ,context.getString(R.string.spyLovedMe_description)
                , context.getString(R.string.spyLovedMe_worldPremiere)
                ,1977
                ,"Roger Moore, Barbara Bach, Curt Jurgens, Richard Kiel, Caroline Munro, Walter Gotell, Geoffrey Keen, George Baker, Michael Billington, Olga Bisera, " +
                    "Edward De Souza, Bernard Lee, Desmond Llewelyn, Lois Maxwell");

        Movie movie11 = new Movie("Moonraker"
                , R.drawable.moonraker
                ,context.getString(R.string.moonraker_description)
                ,context.getString(R.string.moonraker_worldPremiere)
                ,1979
                ,"Roger Moore, Lois Chiles, Michael Lonsdale, Richard Kiel, Corinne Cléry, Bernard Lee, Desmond Llewelyn, Lois Maxwell, Toshirô Suga, " +
                    "Geoffrey Keen, Emily Bolton, Michael Marshall, Walter Gotell, Blanche Ravalec");

        Movie movie12 = new Movie("For Your Eyes Only"
                , R.drawable.for_your_eyes
                ,context.getString(R.string.fyeyesOnly_description)
                ,context.getString(R.string.fyeyesOnly_worldPremiere)
                ,1981
                ,"Roger Moore, Carole Bouquet, Julian Glover, Topol, Lynn-Holly Johnson, Cassandra Harris, Michael Gothard, Lois Maxwell, Desmond Llewelyn, " +
                    "Geoffrey Keen, James Villiers, Walter Gotell");

        Movie movie13 = new Movie("Octopussy"
                , R.drawable.octapussy
                ,context.getString(R.string.octopussy_description)
                ,context.getString(R.string.octopussy_worldPremiere)
                ,1983
                ,"Roger Moore, Maud Adams, Louis Jourdan, Kabir Bedi, Steven Berkoff, Kristina Wayborn, Vijay Armitraj, Robert Brown, Walter Gotell, " +
                    "Geoffrey Keen, Desmond Llewelyn, Lois Maxwell, Andy Bradford");

        Movie movie14 = new Movie("A View to a Kill"
                , R.drawable.view_to_a_kill
                ,context.getString(R.string.viewToKill_description)
                ,context.getString(R.string.viewToKill_worldPremiere)
                ,1985
                ,"Roger Moore, Christopher Walken, Tanya Roberts, Grace Jones, Patrick Macnee, Patrick Bauchau, David Yip, Fiona Fullerton, Manning Redwood, Alison Doody, Willoughby Gray, Desmond Llewelyn, Robert Brown, Lois Maxwell, " +
                    "Walter Gotell, Geoffrey Keen, Jean Rougerie, Daniel Benzali, Bogdan Kominowski, Papillon Soo, Mary Stavin, " +
                    "Dolph Lundgren, Bill Ackridge");

        Movie movie15 = new Movie("The Living Daylights"
                , R.drawable.daylights
                ,context.getString(R.string.livingDayLights_description)
                ,context.getString(R.string.livingDayLights_worldPremiere)
                ,1987
                ,"Timothy Dalton, Maryam d’Abo, Jeroen Krabbé, Joe Don Baker, John Rhys-Davies, Art Malik, Andreas Wisniewski, Thomas Wheatley, " +
                    "Desmond Llewelyn, Robert Brown, Caroline Bliss, John Terry");

        Movie movie16 = new Movie("Licence to Kill"
                , R.drawable.licence_to_kill
                ,context.getString(R.string.licenceKill_description)
                ,context.getString(R.string.licenceKill_worldPremiere)
                ,1989
                ,"Timothy Dalton, Carey Lowell, Robert Davi, Talisa Soto, Anthony Zerbe, Frank McRae, Wayne Newton, Benicio Del Toro, Desmond Llewelyn, David Hedison, " +
                    "Robert Brown");

        Movie movie17 = new Movie("GoldenEye"
                , R.drawable.goldeneye
                , context.getString(R.string.goldenEye_description)
                ,context.getString(R.string.goldenEye_worldPremiere)
                ,1995
                ,"Pierce Brosnan, Sean Bean, Izabella Scorupco, Famke Janssen, Joe Don Baker, Robbie Coltrane, Alan Cumming, Gottfried John, Tcheky Karyo, Michael Kitchen," +
                    " Serena Gordon, Judi Dench, Desmond Llewelyn, Samantha Bond");

        Movie movie18 = new Movie("Tomorrow Never Dies"
                , R.drawable.tomorrow_never_dies
                ,context.getString(R.string.tneverDies_description)
                ,context.getString(R.string.tneverDies_worldPremiere)
                ,1997
                ,"Pierce Brosnan, Jonathan Pryce, Michelle Yeoh, Teri Hatcher, Joe Don Baker, Götz Otto, Ricky Jay, Judi Dench, Desmond Llewelyn, Samantha Bond," +
                    " Geoffrey Palmer, Colin Salmon, Vincent Schiavelli, Cecilie Thomsen");

        Movie movie19 = new Movie("The World Is Not Enough"
                , R.drawable.word_not_enough
                ,context.getString(R.string.worldNotEnough_description)
                ,context.getString(R.string.worldNotEnough_worldPremiere)
                ,1999
                ,"Pierce Brosnan, Sophie Marceau, Robert Carlyle, Denise Richards, Robbie Coltrane, Judi Dench, Desmond Llewelyn, John Cleese, Maria Grazia Cucinotta, Samantha Bond, Michael Kitchen, Colin Salmon, Goldie, David Calder, " +
                    "Serena Scott Thomas, Ulrich Thomsen, John Seru, Claude-Oliver Rudolph, Patrick Malahide, " +
                    "Omid Djalili Jeff Nuttal, Diran Meghreblian");

        Movie movie20 = new Movie("Die Another Day"
                , R.drawable.die_another_day
                ,context.getString(R.string.dieAnotherDay_description)
                ,context.getString(R.string.dieAnotherDay_worldPremiere)
                ,2002
                ,"Pierce Brosnan, Halle Berry, Toby Stephens, Rosamund Pike, Rick Yune, Michael Madsen, Will Yun Lee, Kenneth Tsang, Judi Dench, John Cleese, " +
                    "Samantha Bond, Emilio Echevarría, Michael Gorevoy, Lawrence Makoare, Colin Salmon");

        Movie movie21 = new Movie("Casino Royale"
                , R.drawable.casino_royale
                ,"After becoming a 00 agent, James Bond hunts down a bomb maker in Madagascar, which leads him to shady financier Alex " +
                    "Dimitrios in the Bahamas, and then to a plot to blow up the prototype Skyfleet airliner at Miami Airport. By preventing the " +
                    "bombing, Bond leaves criminal banker Le Chiffre on the verge of bankruptcy – Le Chiffre lost his clients’ money by betting on " +
                    "Skyfleet’s failure on the stock market. Le Chiffre sets up a high-stakes poker game in Montenegro to win back the lost money. " +
                    "Bond attends with Treasury agent Vesper Lynd and wins, but Le Chiffre kidnaps Lynd and tortures Bond in an attempt to regain the " +
                    "winnings. They are saved when Mr White, a senior figure in terrorist organisation QUANTUM, kills Le Chiffre. However, Lynd is " +
                    "secretly working for White and has made a deal with him to save Bond’s life. In love with Lynd, Bond resigns from MI6 and travels " +
                    "to Venice with her. There, he realises she has betrayed him and stolen the money. After a gunfight with QUANTUM’s men in a " +
                    "collapsing Venetian villa, Lynd lets herself drown because she cannot bear the burden of her guilt. Bond pursues White and shoots " +
                    "him in the leg, then introduces himself; “The name’s Bond, James Bond.”"
                ,"14 November 2006, Odeon Leicester Square, London"
                ,2006
                ,"Daniel Craig, Eva Green, Mads Mikkelsen, Judi Dench, Jeffrey Wright, Ginacarlo Giannini, Caterina Murino, Simon Abkarian, Isaach De Bankole, " +
                    "Jesper Christensen, Ivana Milicevic, Tobias Menzies, Claudio Santamaria, Sébastien Foucan, Malcolm Sinclair");

        Movie movie22 = new Movie("Quantum of Solace"
                , R.drawable.qosolace
                ,"Quantum Of Solace starts 10 minutes after the end of Casino Royale. Bond’s search for answers behind Vesper’s betrayal " +
                    "leads him to uncover QUANTUM, a sinister organisation whose tentacles spread across the globe, with double agents buried within " +
                    "the British government, MI6 and the CIA. Evidence takes him to Haiti, where he meets Camille. She is an agent who has her own" +
                    " vengeance-fuelled agenda, to avenge her family’s deaths at the hands of former Bolivian dictator General Medrano. Posing as " +
                    "the girlfriend of faux-environmentalist Dominic Greene, she becomes suspicious of his land acquisition and business relationship " +
                    "with Medrano. With Bond by her side, they discover Greene is part of QUANTUM, an organisation that is secretly appropriating all " +
                    "of Bolivia’s water supply and replacing its left-of-centre president with a more pliable leader."
                ,"29 October 2008, Odeon " +
                    "Leicester Square, London"
                ,2008
                ,"Daniel Craig, Olga Kurylenko, Mathieu Amalric, Judi Dench, Giancarlo Giannini, Gemma Arterton, Jeffrey Wright, Jesper Christensen, Anatole Taubman," +
                    " Rory Kinnear, Tim Pigott-Smith, Joaquín Cosio");
        Movie movie23 = new Movie("Skyfall"
                , R.drawable.skyfall
                ,"James Bond chases assassin Patrice through the streets of Istanbul to recover a flash drive containing the " +
                    "names of every MI6 and NATO agent embedded in terrorist organisations around the world. As Bond and Patrice fight on top " +
                    "of a moving train, on M’s orders field agent Eve attempts to shoot Patrice, but she hits Bond. He falls 300 feet into the " +
                    "water below and is presumed dead. MI6 is attacked, forcing M to relocate the agency underground. These events cause her " +
                    "authority and position to be challenged by Mallory, the new chairman of the Intelligence and Security Committee. " +
                    "Bond returns broken and full of doubts. He fails MI6’s physical and psychological tests, but M lies to him and tells him he " +
                    "has passed, and she sends him on a mission to track down Patrice in Shanghai. Assuming Patrice’s identity, Bond follows clues " +
                    "that lead him to Severine in Macau, and then to her master, Silva, on an abandoned island. Silva is a former MI6 agent seeking " +
                    "revenge for M’s betrayal of him, but Bond captures him before he can carry out his plan. As M goes in front of a board of inquiry, " +
                    "and Q tries to hack into Silva’s computer, Silva escapes and Bond goes in pursuit. Silva attacks the board of inquiry, but Bond " +
                    "gets M out safely and drives her north to his ancestral home in Scotland, Skyfall. With the help of groundskeeper Kincade, " +
                    "Bond and M defend Skyfall from Silva’s assault, and defeat him, but not before M receives a fatal wound. Later Bond reports to " +
                    "Mallory – the new M – and is ready to take on his new mission."
                ,"23 October 2012, The Royal Albert Hall, London"
                ,2012
                ,"Daniel Craig, Javier Bardem, Judi Dench, Ralph Fiennes, Naomie Harris, Bérénice Marlohe, " +
                    "Albert Finney, Ben Whishaw, Rory Kinnear, Ola Rapace, Helen McCory");

        Movie movie24 = new Movie("Spectre"
                , R.drawable.spectre
                ,"On a rogue mission in Mexico City Bond kills an assassin. Back in London, Bond is grounded by M but confides " +
                    "in Moneypenny that he was acting on orders from the previous M before she died. Bond travels to Rome and infiltrates a secret " +
                    "meeting, but their leader Franz Oberhauser, reveals Bond’s presence. The terrifying Hinx pursues Bond in a car chase. " +
                    "In Austria, Bond meets his old nemesis Mr White and makes a promise to keep Mr White’s daughter safe in exchange for leading " +
                    "him to Oberhauser. The daughter, Dr Madeleine Swann, is reluctant to help, but after Bond rescues her from Hinx she agrees. " +
                    "She reveals the secret organisation is SPECTRE. Swann leads Bond to Tangier and from there they journey by train to a desert " +
                    "location, Swann makes Bond question the life he has chosen for himself. Hinx appears and a vicious fight ensues. " +
                    "At a high-tech facility in the desert Bond and Swann meet Oberhauser, He amasses information to manipulate events and " +
                    "is about to gain control of a global surveillance network. After Oberhauser tortures Bond and reveals himself to be " +
                    "Ernst Stavro Blofeld, Bond and Swann escape and destroy the base. In London Bond debriefs M, is captured by " +
                    "Blofeld, then rescues Swann. Bond has the opportunity to kill Blofeld but decides to let him live. Bond joins Swann, " +
                    "leaving his old life behind."
                ,"26 October 2015, The Royal Albert Hall, London"
                ,2015
                ,"Daniel Craig, Christoph Waltz, Léa Seydoux, Ralph Fiennes, Monica Bellucci, Ben Whishaw, Naomie Harris," +
                    " Dave Bautista, Andrew Scott, Rory Kinnear, Jesper Christensen");

        Movie movie25 = new Movie("No Time to Die"
                , R.drawable.no_time_to_die
                ,"After a flashback to Madeleine’s childhood and an attack on her family home, in which the masked assassin " +
                    "Safin spares her life, Bond and Madeleine are enjoying a new life in Italy. Bond visits Vesper Lynd’s family tomb to say " +
                    "his final goodbye but is set upon by SPECTRE agents led by the henchman Primo. The pair escape in the Aston Martin DB5. " +
                    "Bond believes that Madeleine has betrayed him and they part ways.\n" +
                    "In London, SPECTRE attacks again, destroying a laboratory that is developing a devastating bioweapon called Heracles, " +
                    "and kidnapping its chief scientist Valdo Obruchev. In the wake of the attack, Felix Leiter visits Bond in " +
                    "Jamaica and asks for his help. Bond sails to Cuba where he and CIA agent Paloma witness Heracles kill a gathering of " +
                    "SPECTRE agents. Bond beats the new double-0 agent to the capture of Obruchev and delivers him to Felix out at sea. " +
                    "The rogue CIA agent Logan Ash betrays them, killing Felix. Bond returns to London, desperate to avenge his friend’s death. " +
                    "Bond receives a frosty reception from M although is eventually allowed to visit the incarcerated Blofeld. " +
                    "This precipitates a brief and painful reunion with Madeleine and elicits a number of startling revelations from " +
                    "Blofeld before he succumbs to a nasty death. Armed with fresh information, Bond tracks Madeleine to Norway and the pair " +
                    "reunite, learning about the villain Safin and enmity for SPECTRE from secret files collected by Madeleine’s father, " +
                    "Mr White. Ash attacks them and Safin kidnaps Madeleine, taking her to his island base. M orders Bond and Nomi to attack " +
                    "and they rescue Madeleine, killing Obruchev, Primo and Safin."
                ,"28 September 2021, Royal Albert Hall, London"
                ,2021
                ,"Daniel Craig, Rami Malek, Léa Seydoux, Lashana Lynch, Ben Whishaw, Naomie Harris, Ralph Fiennes, " +
                    "Jeffrey Wright, Rory Kinnear, Christoph Waltz, David Dencik, Ana de Armas, Billy Magnussen, Dali Benssalah");


        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);
        movieList.add(movie4);
        movieList.add(movie5);
        movieList.add(movie6);
        movieList.add(movie7);
        movieList.add(movie8);
        movieList.add(movie9);
        movieList.add(movie10);
        movieList.add(movie11);
        movieList.add(movie12);
        movieList.add(movie13);
        movieList.add(movie14);
        movieList.add(movie15);
        movieList.add(movie16);
        movieList.add(movie17);
        movieList.add(movie18);
        movieList.add(movie19);
        movieList.add(movie20);
        movieList.add(movie21);
        movieList.add(movie22);
        movieList.add(movie23);
        movieList.add(movie24);
        movieList.add(movie25);

return movieList;
    }

    public ArrayList<Movie> insertPicture() {
        ArrayList<Movie> picturesList = new ArrayList<>();

        // No Time To Die
         List<Integer> ntd= Arrays.asList(
                R.drawable.ntd_pic01
                ,R.drawable.ntd_pic02
                ,R.drawable.ntd_pic03
                ,R.drawable.ntd_pic04
                ,R.drawable.ntd_pic05
                ,R.drawable.ntd_pic06
                ,R.drawable.ntd_pic07
                ,R.drawable.ntd_pic08
                ,R.drawable.ntd_pic09
                ,R.drawable.ntd_pic10
                ,R.drawable.ntd_pic11
                ,R.drawable.ntd_pic12
                ,R.drawable.ntd_pic13
                ,R.drawable.ntd_pic14
                ,R.drawable.ntd_pic15
                ,R.drawable.ntd_pic16
         );
        Movie movie25 = new Movie("No Time to Die",ntd);
        picturesList.add(movie25);

        // Spectre
        List<Integer> spectre= Arrays.asList(
                R.drawable.spectre_pic01
                ,R.drawable.spectre_pic02
                ,R.drawable.spectre_pic03
                ,R.drawable.spectre_pic04
                ,R.drawable.spectre_pic05
                ,R.drawable.spectre_pic06
                ,R.drawable.spectre_pic07
                ,R.drawable.spectre_pic08
                ,R.drawable.spectre_pic09

        );

        Movie movie24 = new Movie("Spectre",spectre);
        picturesList.add(movie24);

        // Skyfall
        List<Integer> skyfall= Arrays.asList(
                R.drawable.skyfall_pic01
                ,R.drawable.skyfall_pic02
                ,R.drawable.skyfall_pic03
                ,R.drawable.skyfall_pic04
                ,R.drawable.skyfall_pic05
                ,R.drawable.skyfall_pic06
                ,R.drawable.skyfall_pic07
                ,R.drawable.skyfall_pic08
                ,R.drawable.skyfall_pic09

        );

        Movie movie23 = new Movie("Skyfall",skyfall);
        picturesList.add(movie23);

        // Quantum of Solace
        List<Integer> solace= Arrays.asList(
                R.drawable.solace_pic01
                ,R.drawable.solace_pic02
                ,R.drawable.solace_pic03
                ,R.drawable.solace_pic04
                ,R.drawable.solace_pic05
                ,R.drawable.solace_pic06
                ,R.drawable.solace_pic07
                ,R.drawable.solace_pic08
                ,R.drawable.solace_pic09

        );

        Movie movie22 = new Movie("Quantum of Solace",solace);
        picturesList.add(movie22);


        // Casino Royale
        List<Integer> casino= Arrays.asList(
                R.drawable.casino_pic01
                ,R.drawable.casino_pic02
                ,R.drawable.casino_pic03
                ,R.drawable.casino_pic04
                ,R.drawable.casino_pic05
                ,R.drawable.casino_pic06
                ,R.drawable.casino_pic07
                ,R.drawable.casino_pic08
                ,R.drawable.casino_pic09

        );

        Movie movie21 = new Movie("Casino Royale",casino);
        picturesList.add(movie21);


        // Die Another Day
        List<Integer> dad= Arrays.asList(
                R.drawable.dad_pic01
                ,R.drawable.dad_pic02
                ,R.drawable.dad_pic03
                ,R.drawable.dad_pic04
                ,R.drawable.dad_pic05
                ,R.drawable.dad_pic06
                ,R.drawable.dad_pic07
                ,R.drawable.dad_pic08

        );

        Movie movie20 = new Movie("Die Another Day",dad);
        picturesList.add(movie20);

        // The World Is Not Enough
        List<Integer> wne= Arrays.asList(
                R.drawable.wne_pic01
                ,R.drawable.wne_pic02
                ,R.drawable.wne_pic03
                ,R.drawable.wne_pic04
                ,R.drawable.wne_pic05
                ,R.drawable.wne_pic06
                ,R.drawable.wne_pic07
                ,R.drawable.wne_pic08
                ,R.drawable.wne_pic09

        );

        Movie movie19 = new Movie("The World Is Not Enough",wne);
        picturesList.add(movie19);

        // Tomorrow Never Dies
        List<Integer> tnd= Arrays.asList(
                R.drawable.tnd_pic01
                ,R.drawable.tnd_pic02
                ,R.drawable.tnd_pic03
                ,R.drawable.tnd_pic04
                ,R.drawable.tnd_pic05
                ,R.drawable.tnd_pic06
                ,R.drawable.tnd_pic07
                ,R.drawable.tnd_pic08
                ,R.drawable.tnd_pic09

        );

        Movie movie18 = new Movie("Tomorrow Never Dies",tnd);
        picturesList.add(movie18);

        // Goldeneye
        List<Integer> goldeneye= Arrays.asList(
                R.drawable.goldeneye_pic01
                ,R.drawable.goldeneye_pic02
                ,R.drawable.goldeneye_pic03
                ,R.drawable.goldeneye_pic04
                ,R.drawable.goldeneye_pic05
                ,R.drawable.goldeneye_pic06
                ,R.drawable.goldeneye_pic07
                ,R.drawable.goldeneye_pic08
                ,R.drawable.goldeneye_pic09

        );

        Movie movie17 = new Movie("GoldenEye",goldeneye);
        picturesList.add(movie17);

        // Licence To Kill
        List<Integer> ltk = Arrays.asList(
                R.drawable.ltk_pic01
                ,R.drawable.ltk_pic02
                ,R.drawable.ltk_pic03
                ,R.drawable.ltk_pic04
                ,R.drawable.ltk_pic05
                ,R.drawable.ltk_pic06
                ,R.drawable.ltk_pic07
                ,R.drawable.ltk_pic08
                ,R.drawable.ltk_pic09

        );

        Movie movie16 = new Movie("Licence to Kill",ltk);
        picturesList.add(movie16);

        // The Living DayLights
        List<Integer> daylights = Arrays.asList(
                R.drawable.daylights_pic01
                ,R.drawable.daylights_pic02
                ,R.drawable.daylights_pic03
                ,R.drawable.daylights_pic04
                ,R.drawable.daylights_pic05
                ,R.drawable.daylights_pic06
                ,R.drawable.daylights_pic07
                ,R.drawable.daylights_pic08
                ,R.drawable.daylights_pic09

        );

        Movie movie15 = new Movie("The Living Daylights",daylights);
        picturesList.add(movie15);

        // A View To A Kill
        List<Integer> vtk = Arrays.asList(
                R.drawable.vtk_pic01
                ,R.drawable.vtk_pic02
                ,R.drawable.vtk_pic03
                ,R.drawable.vtk_pic04
                ,R.drawable.vtk_pic05
                ,R.drawable.vtk_pic06
                ,R.drawable.vtk_pic07
                ,R.drawable.vtk_pic08
                ,R.drawable.vtk_pic09

        );

        Movie movie14 = new Movie("A View to a Kill",vtk);
        picturesList.add(movie14);

        // Octopussy
        List<Integer> octopussy = Arrays.asList(
                R.drawable.octopussy_pic01
                ,R.drawable.octopussy_pic02
                ,R.drawable.octopussy_pic03
                ,R.drawable.octopussy_pic04
                ,R.drawable.octopussy_pic05
                ,R.drawable.octopussy_pic06
                ,R.drawable.octopussy_pic07
                ,R.drawable.octopussy_pic08
                ,R.drawable.octopussy_pic09

        );

        Movie movie13 = new Movie("Octopussy",octopussy);
        picturesList.add(movie13);

        // For Your Eyes Only
        List<Integer> eyesonly = Arrays.asList(
                R.drawable.eyesonly_pic01
                ,R.drawable.eyesonly_pic02
                ,R.drawable.eyesonly_pic03
                ,R.drawable.eyesonly_pic04
                ,R.drawable.eyesonly_pic05
                ,R.drawable.eyesonly_pic06
                ,R.drawable.eyesonly_pic07
                ,R.drawable.eyesonly_pic08
                ,R.drawable.eyesonly_pic09

        );

        Movie movie12 = new Movie("For Your Eyes Only",eyesonly);
        picturesList.add(movie12);

        // Moonraker
        List<Integer> moonraker = Arrays.asList(
                R.drawable.moonraker_pic01
                ,R.drawable.moonraker_pic02
                ,R.drawable.moonraker_pic03
                ,R.drawable.moonraker_pic04
                ,R.drawable.moonraker_pic05
                ,R.drawable.moonraker_pic06
                ,R.drawable.moonraker_pic07
                ,R.drawable.moonraker_pic08
                ,R.drawable.moonraker_pic09

        );

        Movie movie11 = new Movie("Moonraker",moonraker);
        picturesList.add(movie11);

        // The Spy Who Loved Me
        List<Integer> spy = Arrays.asList(
                R.drawable.spy_pic01
                ,R.drawable.spy_pic02
                ,R.drawable.spy_pic03
                ,R.drawable.spy_pic04
                ,R.drawable.spy_pic05
                ,R.drawable.spy_pic06
                ,R.drawable.spy_pic07
                ,R.drawable.spy_pic08
                ,R.drawable.spy_pic09

        );

        Movie movie10 = new Movie("The Spy Who Loved Me",spy);
        picturesList.add(movie10);

        // The Man With The Golden Gun
        List<Integer> goldengun = Arrays.asList(
                R.drawable.goldengun_pic01
                ,R.drawable.goldengun_pic02
                ,R.drawable.goldengun_pic03
                ,R.drawable.goldengun_pic04
                ,R.drawable.goldengun_pic05
                ,R.drawable.goldengun_pic06
                ,R.drawable.goldengun_pic07
                ,R.drawable.goldengun_pic08
                ,R.drawable.goldengun_pic09

        );

        Movie movie9 = new Movie("The Man with the Golden Gun",goldengun);
        picturesList.add(movie9);

        // Live And Let Die
        List<Integer> lald = Arrays.asList(
                R.drawable.lald_pic01
                ,R.drawable.lald_pic02
                ,R.drawable.lald_pic03
                ,R.drawable.lald_pic04
                ,R.drawable.lald_pic05
                ,R.drawable.lald_pic06
                ,R.drawable.lald_pic07
                ,R.drawable.lald_pic08
                ,R.drawable.lald_pic09

        );

        Movie movie8 = new Movie("Live and Let Die",lald);
        picturesList.add(movie8);

        // Diamonds Are Forever
        List<Integer> diamonds = Arrays.asList(
                R.drawable.diamonds_pic01
                ,R.drawable.diamonds_pic02
                ,R.drawable.diamonds_pic03
                ,R.drawable.diamonds_pic04
                ,R.drawable.diamonds_pic05
                ,R.drawable.diamonds_pic06
                ,R.drawable.diamonds_pic07
                ,R.drawable.diamonds_pic08
                ,R.drawable.diamonds_pic09

        );

        Movie movie7 = new Movie("Diamonds Are Forever",diamonds);
        picturesList.add(movie7);

        // On Her Majesty's Secret Service
        List<Integer> majesty = Arrays.asList(
                R.drawable.majesty_pic01
                ,R.drawable.majesty_pic02
                ,R.drawable.majesty_pic03
                ,R.drawable.majesty_pic04
                ,R.drawable.majesty_pic05
                ,R.drawable.majesty_pic06
                ,R.drawable.majesty_pic07
                ,R.drawable.majesty_pic08
                ,R.drawable.majesty_pic09

        );

        Movie movie6 = new Movie("On Her Majesty's Secret Service",majesty);
        picturesList.add(movie6);

        // You Only Live Twice
        List<Integer> twice = Arrays.asList(
                R.drawable.twice_pic01
                ,R.drawable.twice_pic02
                ,R.drawable.twice_pic03
                ,R.drawable.twice_pic04
                ,R.drawable.twice_pic05
                ,R.drawable.twice_pic06
                ,R.drawable.twice_pic07
                ,R.drawable.twice_pic08
                ,R.drawable.twice_pic09

        );

        Movie movie5 = new Movie("You Only Live Twice",twice);
        picturesList.add(movie5);

        // Thunderball
        List<Integer> thunderball = Arrays.asList(
                R.drawable.thunderball_pic01
                ,R.drawable.thunderball_pic02
                ,R.drawable.thunderball_pic03
                ,R.drawable.thunderball_pic04
                ,R.drawable.thunderball_pic05
                ,R.drawable.thunderball_pic06
                ,R.drawable.thunderball_pic07
                ,R.drawable.thunderball_pic08
                ,R.drawable.thunderball_pic09

        );

        Movie movie4 = new Movie("Thunderball",thunderball);
        picturesList.add(movie4);

        // Goldfinger
        List<Integer> goldfinger = Arrays.asList(
                R.drawable.goldfinger_pic01
                ,R.drawable.goldfinger_pic02
                ,R.drawable.goldfinger_pic03
                ,R.drawable.goldfinger_pic04
                ,R.drawable.goldfinger_pic05
                ,R.drawable.goldfinger_pic06
                ,R.drawable.goldfinger_pic07
                ,R.drawable.goldfinger_pic08
                ,R.drawable.goldfinger_pic09

        );

        Movie movie3 = new Movie("Goldfinger",goldfinger);
        picturesList.add(movie3);

        // From Russia With Love
        List<Integer> russia = Arrays.asList(
                R.drawable.russia_pic01
                ,R.drawable.russia_pic02
                ,R.drawable.russia_pic03
                ,R.drawable.russia_pic04
                ,R.drawable.russia_pic05
                ,R.drawable.russia_pic06
                ,R.drawable.russia_pic07
                ,R.drawable.russia_pic08
                ,R.drawable.russia_pic09

        );

        Movie movie2 = new Movie("From Russia with Love",russia);
        picturesList.add(movie2);

        // Dr. No
        List<Integer> no = Arrays.asList(
                R.drawable.no_pic01
                ,R.drawable.no_pic02
                ,R.drawable.no_pic03
                ,R.drawable.no_pic04
                ,R.drawable.no_pic05
                ,R.drawable.no_pic06
                ,R.drawable.no_pic07
                ,R.drawable.no_pic08
                ,R.drawable.no_pic09

        );

        Movie movie1 = new Movie("Dr. No",no);
        picturesList.add(movie1);

        return picturesList;
    }
}
