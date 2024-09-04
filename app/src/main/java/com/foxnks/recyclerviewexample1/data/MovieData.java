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
                ,"James Bond is assigned by his superior M to help a young Russian girl Tatiana Romanova, who has declared her desire to defect " +
                    "from her job as a clerk in the Russian embassy in Istanbul with an invaluable Lektor cipher machine. Believing herself a willing tool " +
                    "of her government, Tatiana is actually the pawn of SPECTRE, a group of international criminals who plan to use the beautiful Russian " +
                    "girl to lure Bond to his death and to confound both the British and Russian Secret Service agencies.\n" +
                    "In the intriguing atmosphere of Istanbul, Bond is aided by Kerim Bey, the Turkish agent for the British Secret Service, " +
                    "whom Bond comes to respect and admire. After eluding several death traps in Istanbul, Bond and Tatiana escape aboard the " +
                    "Orient Express. SPECTRE has assigned their cold-blooded killer, Grant to kill and discredit the famed British agent, in hand-to-hand " +
                    "combat Bond triumphs over Grant in the close quarters of his train compartment, but the attempts on his life are by no means over. " +
                    "He later fights an unequal battle against a SPECTRE helicopter and makes a desperate dash across the Gulf of Venice in a speedboat " +
                    "chased by a horde of enemy agents. In Venice, he faces the final attempt on his life when Rosa Klebb, the master planner of the " +
                    "SPECTRE murder organisation, makes a personal bid to kill him."
                ,"10 October 1963, Odeon Leicester Square, London"
                ,1963
                ,"Sean Connery, Daniela Bianchi, Pedro Armendáriz, Lotte Lenya, Robert Shaw, Bernard Lee, Eunice Gayson, Walter Gotell," +
                    " Francis De Wolff, Lois Maxwell, Aliza Gur, Martine Beswicke, Vladek Shyebal, Anthony Dawson, Desmond Llewelyn, Leila");

        Movie movie3 = new Movie("Goldfinger"
                , R.drawable.goldfinger
                ,"James Bond is assigned to investigate one of the wealthiest men in the world, Auric Goldfinger, who is suspected " +
                    "of smuggling England’s gold reserves. Goldfinger’s greed is exceeded only by his disrespect for human life. Bond, aided " +
                    "by Goldfinger’s secretary Jill Masterson, catches Goldfinger cheating at cards. In retaliation, Goldfinger has Jill Masterson " +
                    "killed by smothering her with gold paint. The dead girl’s sister Tilly is also killed, when she follows Goldfinger to " +
                    "Switzerland and attempts revenge. Bond is captured by Goldfinger’s huge manservant Oddjob, and almost killed by a deadly " +
                    "laser beam. Drugged, 007 finds himself on Goldfinger’s private jet being flown to America where Goldfinger plans to " +
                    "contaminate the Fort Knox gold increasing the value of his own gold. Bond, Pussy Galore and her flying circus thwart " +
                    "Goldfinger’s plot."
                ,"17 September 1964, Odeon Leicester Square, London"
                ,1964
                ,"Sean Connery, Honor Blackman, Gert Fröbe, Shirley Eaton, Tania Mallet, Harold Sakata, Bernard Lee, " +
                    "Martin Benson, Cec Linder, Lois Maxwell, Desmond Llewelyn");

        Movie movie4 = new Movie("Thunderball"
                , R.drawable.thunderball
                ,"SPECTRE steals a Vulcan bomber carrying two nuclear warheads and holds NATO to ransom to the sum of £100 million. " +
                    "In a race against time, Bond discovers the only lead – a photo of NATO pilot Major Derval with his sister, Domino – and is " +
                    "assigned to Nassau to investigate. Once he contacts Domino, and sees her connection to Emilio Largo, Bond and his team hunt " +
                    "for the bombs on board Largo’s yacht, the Disco Volante, and at his villa, Palmyra, but without success. After dispatching " +
                    "SPECTRE agent Fiona Volpe, Bond enlists the help of Domino by showing her proof that Largo killed her brother. As the Disco " +
                    "Volante sails for Miami with the bombs aboard, Domino is discovered spying and is tortured by Largo. Bond takes part in the " +
                    "thrilling underwater fight between SPECTRE and US aqua-paratroopers, before tackling Largo on board the Disco Volante. " +
                    "As Largo is about to shoot Bond, Domino harpoons him, gaining revenge for the murder of her brother."
                ,"9 December 1965, " +
                    "Hibiya Cinema, Tokyo, Japan"
                ,1965
                ,"Sean Connery, Claudine Auger, Adolfo Celi, Luciana Paluzzi, Rik Van Nutter, Guy Doleman, Molly Peters, " +
                    "Martine Beswick, Bernard Lee, Desmond Llewelyn, Lois Maxwell");

        Movie movie5 = new Movie("You Only Live Twice"
                , R.drawable.only_live_twice
                ,"James Bond is assassinated by Chinese agents in Hong Kong, but it is a ruse so that Bond can travel incognito " +
                    "to Japan and investigate the hijacking of American and Russian spacecraft. Together with Tiger Tanaka and Aki of the " +
                    "Japanese Secret Service, Bond traces a supply of liquid oxygen, which is used to fuel rockets, to a southern Japanese island. " +
                    "So that Bond can live on the island without arousing suspicion, he becomes Japanese in appearance, trains with Tanaka’s ninjas," +
                    " and marries Kissy Suzuki. Bond and Kissy look into the mysterious death of a fishing girl, and discover that SPECTRE, commanded" +
                    " by Ernst Stavro Blofeld, have a secret rocket complex hidden inside a volcano. Bond, Tanaka, Kissy and the ninjas attack " +
                    "the base, and stop Blofeld from detonating a nuclear war between Russia and America, but Blofeld escapes, leaving the base " +
                    "to self-destruct."
                ,"12 June 1967, Odeon Leicester Square, London"
                ,1967
                ,"Sean Connery, Akiko Wakabayashi, Mie Hama, Tetsuro Tamba, Teru Shimada, Karin Dor, Donald Pleasence, " +
                    "Bernard Lee, Desmond Llewelyn, Lois Maxwell, Charles Gray");

        Movie movie6 = new Movie("On Her Majesty's Secret Service"
                , R.drawable.secret_service
                ,"While James Bond is hunting Ernst Stavro Blofeld, head of SPECTRE, at a beach he saves Tracy from committing " +
                    "suicide by drowning. Afterwards Bond and Tracy begin a relationship that gives her a reason to live. With the help of " +
                    "Tracy’s father, Draco, head of the Unione Corse crime syndicate, Bond tracks down Blofeld to Piz Gloria, on a mountaintop " +
                    "in the Alps. Here he finds that Blofeld is brainwashing a group of women to act as his secret agents of biological warfare so " +
                    "that he can blackmail world powers. Bond infiltrates Piz Gloria disguised as Sir Hilary Bray of the College of Arms. When " +
                    "his real identity is discovered, Bond escapes and reunites with Tracy, but she is captured by Blofeld after being caught in an " +
                    "avalanche. The world powers refuse to attack Blofeld, so Draco leads the Unione Corse’s attack on Piz Gloria and rescues Tracy. " +
                    "During the siege, Bond fights Blofeld on a bob-sleigh run and believes Blofeld to be dead. Afterwards, Tracy and Bond marry, " +
                    "but Blofeld exacts his revenge when Tracy is killed in a hail of bullets intended for Bond."
                ,"18 December 1969, Odeon Leicester " +
                    "Square, London"
                ,1969
                ,"George Lazenby, Diana Rigg, Telly Savalas, Gabriele Ferzetti, Ilse Steppat, Angela Scoular, Lois Maxwell, Catherina Von Schell, George Baker, " +
                    "Bernard Lee, Bernard Horsfall, Desmond Llewelyn, Yuri Borienko");

        Movie movie7 = new Movie("Diamonds Are Forever"
                , R.drawable.diamonds_are_forever
                ,"MI6 assign Bond to investigate who is hoarding the world’s supply of diamonds. The case leads Bond to Amsterdam," +
                    " where he poses as criminal Peter Franks and meets Tiffany Case, a glamorous gemstone smuggler. Bond and Tiffany smuggle " +
                    "the diamonds to Las Vegas, where Bond suspects that reclusive industrialist Willard Whyte is behind the conspiracy. " +
                    "Bond infiltrates Whyte’s desert laboratory and finds that the diamonds are being used as part of a laser beam satellite. " +
                    "Back in Vegas, Bond sneaks into Whyte’s penthouse, where he comes face-to-face with his arch-nemesis Blofeld, who has " +
                    "kidnapped Whyte and is impersonating him. Blofeld plans to hold the world hostage for ransom with the deadly satellite. " +
                    "After being left for dead by assassins Mr Kidd and Mr Wint, Bond and Tiffany follow Blofeld to his oil-rig base. " +
                    "As CIA helicopter gunships attack, Bond disarms the satellite and prevents Blofeld’s escape. On the sea voyage back to " +
                    "London, Bond disposes of Kidd and Wint as they try to assassinate him."
                ,"30 December 1971, Odeon Leicester Square, London"
                ,1971
                ,"Sean Connery, Jill St. John, Charles Gray, Lana Wood, Jimmy Dean, Bruce Cabot, Putter Smith, " +
                    "Bruce Glover, Norman Burton, Bernard Lee, Desmond Llewelyn, Lois Maxwell");

        Movie movie8 = new Movie("Live and Let Die"
                , R.drawable.live_and_letdie
                ,"While investigating the deaths of three British agents, James Bond falls foul of gangster Mr. Big, who seems to have " +
                    "connections to Dr. Kananga, the president of San Monique. Bond follows leads to New Orleans, then to San Monique, where he is " +
                    "aided by double agent Rosie Carver. After freeing Kananga’s girlfriend, Solitaire, a seer who foretells the future with Tarot " +
                    "cards, Bond discovers that Kananga and Mr. Big are one and the same. Via his chain of Fillet of Soul restaurants, Kananga plans " +
                    "to flood the USA with two tons of free heroin, which will put his competitors out of business and allow him to monopolise the " +
                    "drug’s supply. When Solitaire is recaptured by Kananga, Bond, with help from CIA agent Felix Leiter and Quarrel Jr, returns to " +
                    "San Monique to kill Kananga and save Solitaire, before she is ritually sacrificed by Baron Samedi, the voodoo chief."
                ,"6 July 1973, " +
                    "Odeon Leicester Square, London"
                ,1973
                ,"Roger Moore, Yaphet Kotto, Jane Seymour, Clifton James, Julius W. Harris, Geoffrey Holder, David Hedison, Gloria Hendry, Bernard Lee, " +
                    "Lois Maxwell, Tommy Lane, Earl Jolly Brown, Roy Stewart, Lon Statton");

        Movie movie9 = new Movie("The Man with the Golden Gun"
                , R.drawable.man_golden_gun
                ,"James Bond receives a gold bullet inscribed with “007”, signifying he has been targeted by high-class professional " +
                    "assassin Francisco Scaramanga known as “The Man with the Golden Gun”. 007 is relieved of his current assignment, the " +
                    "search for scientist Gibson and his solex agitator, the solution to the global energy crisis, and determines to find " +
                    "Scaramanga. The trail leads to a specialist armorer Lazar in Macau, then to Scaramanga’s contact Andrea and industrialist " +
                    "Hai Fat in Hong Kong. After killing Gibson, Scaramanga steals the solex agitator and kidnaps MI6 liaison office Mary Goodnight. " +
                    "A homing device leads Bond to Scaramanga’s lair, an isolated island in Chinese waters. Bond travels there by seaplane, " +
                    "kills Scaramanga in a duel, retrieves the solex agitator, and escapes with Goodnight in Scaramanga’s junk."
                ,"19 December 1974, " +
                    "Odeon Leicester Square, London"
                ,1974
                ,"Roger Moore, Christopher Lee, Britt Ekland, Maud Adams, Hervé Villechaize, Clifton James, Richard Loo, Soon-Taik Oh, Marc Lawrence, Bernard Lee, Lois Maxwell, " +
                    "Marne Maitland, Desmond Llewelyn, James Cossins, Chan Yiu Lam, Carmen Sautoy, Gerald James, Michael Osborne, Michael Fleming");

        Movie movie10 = new Movie("The Spy Who Loved Me"
                , R.drawable.spy_who_loves_me
                ,"After British and Russian submarines carrying nuclear warheads vanish, James Bond travels to Egypt, where illicit microfilm " +
                    "plans for a submarine tracking system are being offered for sale. In Cairo he meets KGB agent Major Anya Amasova, who is on the " +
                    "same mission. After their contact is murdered, they fight Jaws, a steel-toothed villain in the pay of industrialist Karl Stromberg. " +
                    "MI6 and the KGB order Bond and Amasova to work together. In Sardinia, they encounter Stromberg and suspect that he is behind the " +
                    "submarine disappearances. After being chased by Jaws and Stromberg’s henchmen, they escape underwater in Bond’s amphibious Lotus " +
                    "Esprit. Onboard a US submarine, the spies learn more about Stromberg’s underwater base, Atlantis, and about the supertanker " +
                    "The Liparus. When their sub is captured by The Liparus, a huge vessel, that “swallows” submarines, Bond discovers " +
                    "Stromberg’s plan to trigger a nuclear war. Bond leads the captured sailors against The Liparus’ crew and defeats Stromberg. " +
                    "Atlantis sinks but Jaws escapes. "
                ,"7 July 1977, Odeon Leicester Square, London"
                ,1977
                ,"Roger Moore, Barbara Bach, Curt Jurgens, Richard Kiel, Caroline Munro, Walter Gotell, Geoffrey Keen, George Baker, Michael Billington, Olga Bisera, " +
                    "Edward De Souza, Bernard Lee, Desmond Llewelyn, Lois Maxwell");

        Movie movie11 = new Movie("Moonraker"
                , R.drawable.moonraker
                ,"When the Moonraker space shuttle is hijacked, M sends Bond to the shuttle’s manufacturer, Hugo Drax, to investigate. " +
                    "Bond follows clues that lead him first to Venice, where he discovers Drax’s laboratory manufacturing a highly toxic nerve gas, " +
                    "and then to Rio, where he teams up with CIA agent and astrophysicist Holly Goodhead. At every turn they are attacked by Jaws on " +
                    "Drax’s orders. Bond goes into the jungle to find the source of the nerve gas, but instead discovers that Drax is launching " +
                    "multiple space shuttles filled with couples who will find safe haven in his secret space station. Drax plans to send pods " +
                    "containing deadly nerve gas to Earth to destroy the human race, and will later repopulate it with his master race of perfect " +
                    "physical specimens. A platoon of US marines arrive in a shuttle and defeat Drax’s men in a laser battle, while Bond and Dr. " +
                    "Goodhead track and destroy the deadly gas. "
                ,"26 June 1979, Odeon Leicester Square, London"
                ,1979
                ,"Roger Moore, Lois Chiles, Michael Lonsdale, Richard Kiel, Corinne Cléry, Bernard Lee, Desmond Llewelyn, Lois Maxwell, Toshirô Suga, " +
                    "Geoffrey Keen, Emily Bolton, Michael Marshall, Walter Gotell, Blanche Ravalec");

        Movie movie12 = new Movie("For Your Eyes Only"
                , R.drawable.for_your_eyes
                ,"James Bond is ordered to retrieve the Automatic Targeting Attack Communicator (ATAC), housed on a sunken spy ship, the St. Georges." +
                    " When Sir Timothy Havelock, a marine archaeologist secretly helping the British to locate the ship, is murdered along with his wife," +
                    " Bond is dispatched to Spain to find out who hired the hitman, Gonzales, but before he can find out, Gonzales is killed by Havelock’s" +
                    " daughter, Melina. In Italy, Bond and Melina seek organised-crime figure Milos Columbo through businessman Aristotle Kristatos, " +
                    "then travel to Corfu to pursue Columbo. Columbo reveals that Kristatos is responsible for the Havelock’s murder and is working " +
                    "with the Russians to obtain the ATAC. After retrieving the ATAC from the wreck of the St. Georges, Bond and Melina are captured " +
                    "by Kristatos, but survive his attempt to drown them. Aided by Columbo, Bond and Melina infiltrate the mountaintop monastery " +
                    "of St. Cyril’s, where Bond retrieves the ATAC and prevents Melina from killing Kristatos, who dies by Columbo’s hand. " +
                    "As the Russians arrive to collect the ATAC, Bond destroys it so neither East nor West can have " +
                    "it. "
                ,"24 June 1981, Odeon Leicester Square, London"
                ,1981
                ,"Roger Moore, Carole Bouquet, Julian Glover, Topol, Lynn-Holly Johnson, Cassandra Harris, Michael Gothard, Lois Maxwell, Desmond Llewelyn, " +
                    "Geoffrey Keen, James Villiers, Walter Gotell");

        Movie movie13 = new Movie("Octopussy"
                , R.drawable.octapussy
                ,"009 is found dead at the British Ambassador’s residence in East Berlin, dressed as a circus clown and carrying a fake " +
                    "Fabergé egg. MI6 sends Bond to investigate when the real egg appears at a London auction. Bond swaps the real egg with the " +
                    "fake, and drives up the bidding against exiled Afghan prince Kamal Khan, who ultimately wins the auction. Bond follows Khan" +
                    " back to his palace in Rajasthan, India, where he discovers that Khan is working with Orlov, a renegade Soviet general, " +
                    "and is using Octopussy’s circus troupe to smuggle Soviet treasures into the West. Bond infiltrates the circus, and finds " +
                    "that Orlov has replaced the treasures with a nuclear warhead, primed to explode during the show at a US Air Force base in" +
                    " West Germany. He convinces Octopussy that Khan has betrayed her and she assists Bond in deactivating the warhead. " +
                    "Bond and Octopussy return to India and launch an assault on Khan’s palace. Khan and bodyguard Gobinda capture " +
                    "Octopussy as they escape in a plane. Bond clings to the fuselage in a fight to the death with Gobinda, and manages " +
                    "to rescue Ocotpussy moments before the plane crashes, killing Khan."
                ,"6 June 1983, Odeon Leicester Square, London"
                ,1983
                ,"Roger Moore, Maud Adams, Louis Jourdan, Kabir Bedi, Steven Berkoff, Kristina Wayborn, Vijay Armitraj, Robert Brown, Walter Gotell, " +
                    "Geoffrey Keen, Desmond Llewelyn, Lois Maxwell, Andy Bradford");

        Movie movie14 = new Movie("A View to a Kill"
                , R.drawable.view_to_a_kill
                ,"A microchip James Bond recovers from the body of 003 in Siberia is a copy of one that is impervious to the magnetic pulse " +
                    "of a nuclear blast. It is made by a company recently acquired by Anglo-French combine Zorin Industries, so Bond is assigned " +
                    "to investigate Max Zorin. In Paris, Bond meets detective Aubergine to find out about Zorin, but Aubergine is killed by Zorin’s " +
                    "bodyguard May Day. Bond poses as a horse trainer to infiltrate Zorin’s equestrian estate, but his cover is blown and Zorin " +
                    "tries to drown him. 007 survives and tracks Zorin to San Francisco, where Zorin is planning Project Main Strike: the destruction " +
                    "of Silicon Valley by detonating explosions in mines beneath lakes and flooding the Hayward and San Andreas faults. With help " +
                    "from geologist Stacey Sutton, Bond sabotages Zorin’s scheme. Finding an unexpected ally in May Day, whom Zorin has betrayed, " +
                    "Bond prevents the main explosion from detonating. As Zorin escapes in his airship, he kidnaps Stacey. The final confrontation " +
                    "between Bond and Zorin is atop the Golden Gate Bridge in San Francisco, where Zorin falls to his death."
                ,"22 May 1985, Palace " +
                    "of Fine Arts, San Francisco, USA"
                ,1985
                ,"Roger Moore, Christopher Walken, Tanya Roberts, Grace Jones, Patrick Macnee, Patrick Bauchau, David Yip, Fiona Fullerton, Manning Redwood, Alison Doody, Willoughby Gray, Desmond Llewelyn, Robert Brown, Lois Maxwell, " +
                    "Walter Gotell, Geoffrey Keen, Jean Rougerie, Daniel Benzali, Bogdan Kominowski, Papillon Soo, Mary Stavin, " +
                    "Dolph Lundgren, Bill Ackridge");

        Movie movie15 = new Movie("The Living Daylights"
                , R.drawable.daylights
                ,"After a training exercise in Gibraltar is hijacked and an MI6 agent is murdered, it seems that the KGB’s old policy of " +
                    "Smert Spionam (Death to Spies) has been reactivated. Bond is sent to Czechoslovakia to support the defection of a Russian Army " +
                    "Officer, Koskov. He becomes suspicious when the sniper he has to assassinate appears to be a glamorous cellist, Kara Milovy. " +
                    "Later, when Koskov is kidnapped from the MI6 safe house, Bond’s suspicions are heightened and he combines his official " +
                    "assignment to assassinate General Leonid Pushkin – the new head of the KGB, whom Koskov has named as the initiator of the " +
                    "Smert Spionam policy – with an investigation into Kara and Koskov. Bond, with Kara in tow, pursues Koskov to Tangier, where " +
                    "he is hiding with arms/drug dealer Whitaker and his hired killer, Necros. Betrayed by Kara, Bond is kidnapped and taken to " +
                    "Afghanistan. He escapes and, with the assistance of an army of Afghan rebels led by charismatic Kamran Shah, brings down " +
                    "Whitaker’s illegal activities."
                ,"29 June 1987, Odeon Leicester Square, London"
                ,1987
                ,"Timothy Dalton, Maryam d’Abo, Jeroen Krabbé, Joe Don Baker, John Rhys-Davies, Art Malik, Andreas Wisniewski, Thomas Wheatley, " +
                    "Desmond Llewelyn, Robert Brown, Caroline Bliss, John Terry");

        Movie movie16 = new Movie("Licence to Kill"
                , R.drawable.licence_to_kill
                ,"En route to the wedding of his friend Felix Leiter in Florida, Bond and Leiter take a detour to arrest drug baron Franz Sanchez. " +
                    "It doesn’t take too long, however, for Sanchez to break himself out of jail, and kill the new Mrs Leiter and maim Felix. " +
                    "Bond seeks revenge. With his licence revoked by the British government, and with the aid of CIA operative Pam Bouvier as well " +
                    "as MI6 gadget specialist Q, they bring Sanchez and his entire corrupt drug empire to its knees."
                ,"13 June 1989, Odeon Leicester " +
                    "Square, London"
                ,1989
                ,"Timothy Dalton, Carey Lowell, Robert Davi, Talisa Soto, Anthony Zerbe, Frank McRae, Wayne Newton, Benicio Del Toro, Desmond Llewelyn, David Hedison, " +
                    "Robert Brown");

        Movie movie17 = new Movie("GoldenEye"
                , R.drawable.goldeneye
                ,"It’s 1986, James Bond and agent 006, Alec Trevelyan, infiltrate a Russian weapons factory, but Trevelyan is killed by General " +
                    "Ourumov while Bond escapes. Nine years later General Ourumov and Russian mafia assassin Xenia Onatopp attack the Severnaya " +
                    "satellite control centre and gain control of the GoldenEye weapons system in outer space. Only computer programmer Natalya " +
                    "Simonova escapes Severnaya alive. In St Petersburg, Bond discovers that Trevelyan had faked his own death, and is planning " +
                    "to use the GoldenEye system to punish Britain for betraying his Cossack parents, who later committed suicide. After a dramatic " +
                    "tank chase on the streets of St Petersberg, Bond and Natalya join forces to track Trevelyan to Cuba, and infiltrate his facility. " +
                    "Natalya reprograms GoldenEye, and Bond fights Trevelyan to the death on the installation’s giant radio dish."
                ,"13 November 1995, " +
                    "Radio City Music Hall, New York City, NY, USA"
                ,1995
                ,"Pierce Brosnan, Sean Bean, Izabella Scorupco, Famke Janssen, Joe Don Baker, Robbie Coltrane, Alan Cumming, Gottfried John, Tcheky Karyo, Michael Kitchen," +
                    " Serena Gordon, Judi Dench, Desmond Llewelyn, Samantha Bond");

        Movie movie18 = new Movie("Tomorrow Never Dies"
                , R.drawable.tomorrow_never_dies
                ,"While James Bond spies on a terrorist arms bazaar, he identifies “techno terrorist” Henry Gupta, who is buying a stolen " +
                    "American GPS encoder. As Bond hijacks a Russian plane carrying nuclear torpedoes, Gupta escapes with the encoder during the " +
                    "confusion. Gupta is working for media baron Elliot Carver, who plans to provoke war between China and the United Kingdom, " +
                    "Gupta uses the encoder to send the British frigate HMS Devonshire off-course into Chinese waters, where Carver’s stealth ship, " +
                    "commanded by Stamper, sinks the frigate with a sea drill and steals one of its missiles. Bond has 48 hours to investigate the " +
                    "sinking before the British and Chinese go to war. Bond investigates Carver in Hamburg, seduces Carver’s wife, Paris, and steals " +
                    "the GPS encoder. Carver orders assassin, Dr Kaufman to kill Paris and Bond. Paris dies, but Bond kills Kaufman and escapes. " +
                    "Bond travels to the South China Sea and discovers that one of the missiles is missing from the wreck of the HMS Devonshire. " +
                    "Wai Lin, a Chinese agent on the same case, and Bond are captured by Stamper and taken to Carver’s headquarters " +
                    "in Ho Chi Minh City, but they escape and team up. They board Carver’s stealth ship to prevent him firing the stolen " +
                    "British missile at Beijing. In the final confrontation, Bond detonates an explosive exposing the ship on radar to the " +
                    "Royal Navy, and kills Carver with the sea drill."
                ,"9 December 1997, Odeon Leicester Square, London"
                ,1997
                ,"Pierce Brosnan, Jonathan Pryce, Michelle Yeoh, Teri Hatcher, Joe Don Baker, Götz Otto, Ricky Jay, Judi Dench, Desmond Llewelyn, Samantha Bond," +
                    " Geoffrey Palmer, Colin Salmon, Vincent Schiavelli, Cecilie Thomsen");

        Movie movie19 = new Movie("The World Is Not Enough"
                , R.drawable.word_not_enough
                ,"Following the murder of her father, oil magnate Sir Robert King, Elektra is assigned a bodyguard – MI6’s top agent James Bond." +
                    " Sir Robert, an old friend of M’s, has been assassinated by terrorist Renard, who also seems to be targeting the 800-mile King " +
                    "pipeline, under construction from Azerbaijan to bring oil to the West. Freelance terrorist Renard has a bullet lodged in his skull" +
                    " following a run-in with 009; slowly dying, he feels no pain. Bond and Elektra become emotionally involved, but it transpires that" +
                    " Elektra, previously the victim of a kidnapping plot by Renard, seduced him and has engineered the takeover of her father’s business " +
                    "empire. Elektra kidnaps M and plans to detonate a nuclear explosion in Istanbul, contaminating the Bosphorus and ensuring the King " +
                    "pipeline is the sole oil route west. Bond, aided by atomic physicist Dr Christmas Jones, kills Elektra and Renard, rescues M, " +
                    "and prevents the cataclysm."
                ,"8 November 1999, Bruin & Fox Theatre, Los Angeles, USA"
                ,1999
                ,"Pierce Brosnan, Sophie Marceau, Robert Carlyle, Denise Richards, Robbie Coltrane, Judi Dench, Desmond Llewelyn, John Cleese, Maria Grazia Cucinotta, Samantha Bond, Michael Kitchen, Colin Salmon, Goldie, David Calder, " +
                    "Serena Scott Thomas, Ulrich Thomsen, John Seru, Claude-Oliver Rudolph, Patrick Malahide, " +
                    "Omid Djalili Jeff Nuttal, Diran Meghreblian");

        Movie movie20 = new Movie("Die Another Day"
                , R.drawable.die_another_day
                ,"In North Korea, Bond kills Colonel Moon, who is trading weapons for African blood diamonds, and disfigures Moon’s henchman" +
                    " Zao in the process. Bond is captured and spends 14 months in prison before being exchanged for Zao, who had been captured by the" +
                    "British. MI6 believe Bond has cracked under torture, so he is disavowed. Bond tracks Zao to a Havana clinic, where he meets NSA agent" +
                    " Jinx Johnson, and finds out Zao is receiving DNA therapy to alter his appearance. After Zao escapes from the clinic, Bond follows " +
                    "the diamonds to London and then to billionaire Gustav Graves. M also suspects Graves – she planted agent Miranda Frost as Graves’ " +
                    "assistant – and gives Bond back his 00 status. In Iceland Graves unveils Icarus, a powerful laser satellite. Working together, " +
                    "Bond and Jinx discover that Graves is actually Moon; the colonel didn’t die in Korea and altered his appearance with gene therapy." +
                    " Moon plans to use Icarus to help North Korea invade the South, but Bond and Jinx stow away on his cargo plane, where Jinx kills " +
                    "Frost, who had switched her allegiances to Moon, and Bond kills Moon, so preventing the invasion."
                ,"18 November 2002, The Royal Albert Hall, London"
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
