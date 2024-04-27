package com.digitallibrary.application

import android.app.Application
import com.digitallibrary.R
import com.digitallibrary.ui.model.BooksModel
import com.digitallibrary.ui.model.CategoryModel

class AppConfig : Application() {
    companion object {
        val categoryList = ArrayList<CategoryModel>().apply {
            add(
                CategoryModel(
                    "Action and adventure",
                    image = R.drawable.ic_action_and_advanture,
                    booksList = ArrayList<BooksModel>().apply {
                        add(
                            BooksModel(
                                name = "Jurassic Park (Jurassic Park, #1)",
                                image = R.drawable.ic_jurassic,
                                detail = "An astonishing technique for recovering and cloning dinosaur DNA has been discovered. Now humankind’s most thrilling fantasies have come true. Creatures extinct for eons roam Jurassic Park with their awesome presence and profound mystery, and all the world can visit them—for a price.\nUntil something goes wrong. . . .\nIn Jurassic Park, Michael Crichton taps all his mesmerizing talent and scientific brilliance to create his most electrifying technothriller."
                            )
                        )
                        add(
                            BooksModel(
                                name = "The Hobbit",
                                image = R.drawable.ic_hobbit,
                                detail = "In a hole in the ground there lived a hobbit. Not a nasty, dirty, wet hole, filled with the ends of worms and an oozy smell, nor yet a dry, bare, sandy hole with nothing in it to sit down on or to eat: it was a hobbit-hole, and that means comfort.\nWritten for J.R.R. Tolkien’s own children, The Hobbit met with instant critical acclaim when it was first published in 1937. Now recognized as a timeless classic, this introduction to the hobbit Bilbo Baggins, the wizard Gandalf, Gollum, and the spectacular world of Middle-earth recounts of the adventures of a reluctant hero, a powerful and dangerous ring, and the cruel dragon Smaug the Magnificent. The text in this 372-page paperback edition is based on that first published in Great Britain by Collins Modern Classics (1998), and includes a note on the text by Douglas A. Anderson (2001)."
                            )
                        )
                        add(
                            BooksModel(
                                name = "The Hunger Games",
                                image = R.drawable.ic_hunger,
                                detail = "Could you survive on your own in the wild, with every one out to make sure you don't live to see the morning?\n" +
                                        "\n" +
                                        "In the ruins of a place once known as North America lies the nation of Panem, a shining Capitol surrounded by twelve outlying districts. The Capitol is harsh and cruel and keeps the districts in line by forcing them all to send one boy and one girl between the ages of twelve and eighteen to participate in the annual Hunger Games, a fight to the death on live TV.\n" +
                                        "\n" +
                                        "Sixteen-year-old Katniss Everdeen, who lives alone with her mother and younger sister, regards it as a death sentence when she steps forward to take her sister's place in the Games. But Katniss has been close to dead before—and survival, for her, is second nature. Without really meaning to, she becomes a contender. But if she is to win, she will have to start making choices that weight survival against humanity and life against love."
                            )
                        )
                        add(
                            BooksModel(
                                name = "The Fellowship of the Ring",
                                image = R.drawable.ic_flowership,
                                detail = "Alternate Cover Edition ISBN 0618260269 (copyright page ISBN is 0618346252 - different from back cover)\n" +
                                        "\n" +
                                        "One Ring to rule them all, One Ring to find them, One Ring to bring them all and in the darkeness bind them\n" +
                                        "\n" +
                                        "In ancient times the Rings of Power were crafted by the Elven-smiths, and Sauron, The Dark Lord, forged the One Ring, filling it with his own power so that he could rule all others. But the One Ring was taken from him, and though he sought it throughout Middle-earth, it remained lost to him. After many ages it fell into the hands of Bilbo Baggins, as told in The Hobbit.\n" +
                                        "\n" +
                                        "In a sleepy village in the Shire, young Frodo Baggins finds himself faced with an immense task, as his elderly cousin Bilbo entrusts the Ring to his care. Frodo must leave his home and make a perilous journey across Middle-earth to the Cracks of Doom, there to destroy the Ring and foil the Dark Lord in his evil purpose."
                            )
                        )
                        add(
                            BooksModel(
                                name = "The Bourne Identity",
                                image = R.drawable.ic_bourne,
                                detail = "Who is Jason Bourne? Is he an assassin, a terrorist, a thief? Why has he got four million dollars in a Swiss bank account? Why has someone tried to murder him?...\n" +
                                        "\n" +
                                        "Jason Bourne does not know the answer to any of these questions. Suffering from amnesia, he does not even know that he is Jason Bourne. What manner of man is he? What are his secrets? Who has he killed?"
                            )
                        )
                        add(
                            BooksModel(
                                name = "The Da Vinci Code",
                                image = R.drawable.ic_vinci,
                                detail = "While in Paris, Harvard symbologist Robert Langdon is awakened by a phone call in the dead of the night. The elderly curator of the Louvre has been murdered inside the museum, his body covered in baffling symbols. As Langdon and gifted French cryptologist Sophie Neveu sort through the bizarre riddles, they are stunned to discover a trail of clues hidden in the works of Leonardo da Vinci—clues visible for all to see and yet ingeniously disguised by the painter.\n" +
                                        "\n" +
                                        "Even more startling, the late curator was involved in the Priory of Sion—a secret society whose members included Sir Isaac Newton, Victor Hugo, and Da Vinci—and he guarded a breathtaking historical secret. Unless Langdon and Neveu can decipher the labyrinthine puzzle—while avoiding the faceless adversary who shadows their every move—the explosive, ancient truth will be lost forever."
                            )
                        )
                    })
            )
            add(
                CategoryModel(
                    "Alternate history",
                    image = R.drawable.ic_alt,
                    booksList = ArrayList<BooksModel>().apply {
                        add(
                            BooksModel(
                                name = "The Warm Hands of Ghosts",
                                image = R.drawable.ic_warn,
                                detail = "During the Great War, a combat nurse searches for her brother, believed dead in the trenches despite eerie signs that suggest otherwise, in this hauntingly beautiful historical novel with a speculative twist from the New York Times bestselling author of The Bear and the Nightingale\n" +
                                        "\n" +
                                        "January 1918. Laura Iven was a revered field nurse until she was wounded and discharged from the medical corps, leaving behind a brother still fighting in Flanders. Now home in Halifax, Canada, she receives word of Freddie’s death in combat, along with his personal effects—but something doesn’t make sense. Determined to uncover the truth, Laura returns to Belgium as a volunteer at a private hospital. Soon after arriving, she hears whispers about haunted trenches, and a strange hotelier whose wine gives soldiers the gift of oblivion. Could Freddie have escaped the battlefield, only to fall prey to something—or someone—else?\n" +
                                        "\n" +
                                        "November 1917. Freddie Iven awakens after an explosion to find himself trapped in an overturned pillbox with a wounded enemy soldier, a German by the name of Hans Winter. Against all odds, the two men form an alliance and succeed in clawing their way out. Unable to bear the thought of returning to the killing fields, especially on opposite sides, they take refuge with a mysterious man who seems to have the power to make the hellscape of the trenches disappear.\n" +
                                        "\n" +
                                        "As shells rain down on Flanders, and ghosts move among those yet living, Laura’s and Freddie’s deepest traumas are reawakened. Now they must decide whether their world is worth salvaging—or better left behind entirely."
                            )
                        )
                        add(
                            BooksModel(
                                name = "What Feasts at Night",
                                image = R.drawable.ic_vinci,
                                detail = "The follow-up to T. Kingfisher’s bestselling gothic novella, What Moves the Dead .\n" +
                                        "\n" +
                                        "Retired soldier Alex Easton returns in a horrifying new adventure.\n" +
                                        "\n" +
                                        "After their terrifying ordeal at the Usher manor, Alex Easton feels as if they just survived another war. All they crave is rest, routine, and sunshine, but instead, as a favor to Angus and Miss Potter, they find themself heading to their family hunting lodge, deep in the cold, damp forests of their home country, Gallacia.\n" +
                                        "\n" +
                                        "In theory, one can find relaxation in even the coldest and dampest of Gallacian autumns, but when Easton arrives, they find the caretaker dead, the lodge in disarray, and the grounds troubled by a strange, uncanny silence. The villagers whisper that a breath-stealing monster from folklore has taken up residence in Easton’s home. Easton knows better than to put too much stock in local superstitions, but they can tell that something is not quite right in their home. . . or in their dreams."
                            )
                        )
                        add(
                            BooksModel(
                                name = "Red Side Story",
                                image = R.drawable.ic_red,
                                detail = "The long-awaited follow-up to the New York Times bestselling Shades of Grey—in an exclusive edition for North American readers, complete with a never-before-published short story\n" +
                                        "\n" +
                                        "“Fforde's books are more than an ingenious idea. They are written with buoyant zest and are tautly plotted . . . and are embellished with the rich details of a Dickens or Pratchett.” —The Independent\n" +
                                        "\n" +
                                        "Welcome to Chromatacia, where the societal hierarchy is strictly regulated by one's limited color perception. Civilization has been rebuilt after an unspoken “Something that Happened” five hundred years ago. Society is now color vision-segregated, professions, marriages, and leisure activities all dictated by an individual’s visual ability, and everything run by the shadowy National Color in far-off Emerald City.\n" +
                                        "\n" +
                                        "Out on the fringes of Red Sector West, twenty-year-old Eddie Russett is being bullied into an arranged marriage with the powerful DeMauve family, purples who hope to redden up their progeny’s color-viewing potential with Eddie’s gene stock. Their obnoxious daughter Violet is confident the marriage won’t hamper her style for too long because Eddie is about to go on trial for a murder he didn’t commit, and he’s pretty sure to be sent on a one-way trip to the Green Room for execution by soporific color exposure. Meanwhile, Eddie is engaged in an illegal relationship with his co-defendant, a Green, the charismatic, unpredictable, and occasionally deadly Jane Grey. Time is running out for Eddie and Jane to figure out how to save themselves. Negotiating the narrow boundaries of the Rules within their society, they search for a loophole—some truth of their world that has been hidden from its hyper-policed citizens.\n" +
                                        "\n" +
                                        "New York Times bestselling author Jasper Fforde returns to his fan-favorite Shades of Grey series with this wildly anticipated, laugh-out-loud funny and darkly satiric adventure about two star-crossed lovers on a quest to survive—even if it means upending their entire society in the process."
                            )
                        )
                        add(
                            BooksModel(
                                name = "Boy of Chaotic Making",
                                image = R.drawable.ic_red,
                                detail = "A boy like no other embarks on a transformative journey of magic and self-discovery in the next enchanting Whimbrel House novel by Amazon Charts and Wall Street Journal bestselling author Charlie N. Holmberg.\n" +
                                        "\n" +
                                        "Merritt Fernsby’s life has changed considerably since he inherited Whimbrel House. He’s engaged to Hulda Larkin, who opened his eyes to the uncanny. And he’s grown quite protective of his uncle Owein—several generations, and iterations, removed. Owein is presently inhabiting the body of a mixed-breed terrier when Merritt receives a missive from none other than Alexandrina Victoria, the Queen of England: I am interested in your dog.\n" +
                                        "\n" +
                                        "It’s the queen’s duty to the peerage to keep British wizardry empowered. Her offer: England will find a human vessel for Owein, marry him into the royal family, and add this remarkable soul-shifter to its lineage. For Owein, a boy trapped in the body of a pup, it’s a dream come true. How can Merritt refuse? However, once they are in London and in consortium with a necromancer, the situation doesn’t feel right, both with their hosts and the house they inhabit. Owein is having nightmares. And Hulda’s premonitions warn of danger in Merritt’s future. Clearly, someone doesn’t want them in town.\n" +
                                        "\n" +
                                        "But after two hundred years of being cursed to drift, Owein is determined to chart his own destiny. He’s ready to defy whatever chaos is coming. After all, Owein is the master of chaos, and with Merritt and Hulda’s love and magical support, he can overcome anything."
                            )
                        )
                    })
            )
            add(CategoryModel("Crime", image = R.drawable.ic_crime, booksList = ArrayList<BooksModel>().apply {
                add(
                    BooksModel(
                        name = "That Night: Four Friends, Twenty Years",
                        image = R.drawable.ic_night,
                        detail = "Natasha, Riya, Anjali and Katherine were best friends in college - each different from the other yet inseparable - until that night.\n" +
                                "\n" +
                                "It was the night that began with a bottle of whisky and a game of Ouija but ended with the death of Sania, their unlikeable hostel mate. The friends vowed never to discuss that fateful night, a pact that had kept their friendship and guilt dormant for the last twenty years.\n" +
                                "\n" +
                                "But now, someone has begun to mess with them, threatening to reveal the truth that only Sania knew. Is it a hacker playing on their guilt or has Sania's ghost really returned to avenge her death?\n" +
                                "\n" +
                                "As the faceless enemy closes in on them, the friends come together once again to recount what really happened that night. But when the story is retold by each of them, the pieces don't fit. Because none of them is telling the whole truth . . .\n" +
                                "\n" +
                                "That Night is a dark, twisted tale of friendship and betrayal that draws you in and confounds you at every turn."
                    )
                )
                add(
                    BooksModel(
                        name = "THE SILENT PATIENT",
                        image = R.drawable.ic_silent,
                        detail = "WITH OVER THREE MILLION COPIES SOLD, read the Sunday Times and No.1 New York Times bestselling, record-breaking thriller that everyone is talking about - soon to be a major film. 'The perfect thriller' AJ FINN 'Terrific' - THE TIMES Crime Book of the Month 'Smart, sophisticated suspense' - LEE CHILD 'Compelling' - OBSERVER 'Absolutely brilliant' - STEPHEN FRY 'A totally original psychological mystery' - DAVID BALDACCI 'One of the best thrillers I've read this year' - CARA HUNTER 'The pace and finesse of a master' - BBC CULTURE Alicia Berenson lived a seemingly perfect life until one day six years ago.When she shot her husband in the head five times. Since then she hasn't spoken a single word.It's time to find out why. THE SILENT PATIENT is the gripping must-read thriller of the year - perfect for fans of THE FAMILY UPSTAIRS by Lisa Jewell, BLOOD ORANGE by Harriet Tyce and PLAYING NICE by JP Delaney."
                    )
                )
                add(
                    BooksModel(
                        name = "Crime Book, The ( Big Ideas): Big Ideas Simply Explained",
                        image = R.drawable.ic_crime_book,
                        detail = "Investigate 100 of the world's most notorious crimes, including the Great Train Robbery, the Lindbergh kidnapping, and the murders of serial killer Jeffrey Dahmer.\n" +
                                "\n" +
                                "Were the perpetrators delusional, opportunist, or truly evil? Find out what really happened and how cases were solved.\n" +
                                "\n" +
                                "Discover conmen with sheer verve, such as Victor Lustig who \"sold\" the Eiffel Tower to scrap dealers in 1925, adrenaline-fuelled escapes, and mind-bending exploits of pirates, kidnappers, and drug cartels. The Crime Book demystifies malware, cybercrimes, and Ponzi schemes and sets out the terrifying ploys of mass murderers from 16th-century Elizabeth Báthory who drained young girls' blood to the more recent exploits of Rosemary and Fred West.\n" +
                                "\n" +
                                "Like a virus, crime mutates and adapts. The Crime Book explains how pivotal moments in history opened up new opportunities for criminals, such as the smuggling of alcohol during the American Prohibition era. It also charts developments in justice and forensics including the Innocence Project, which used DNA testing to exonerate wrongly convicted convicts. It examines how the forces of law and order have fought back against crime, explaining ingenious sting operations such as tracking down the jewel thief Bill Mason and the final capture of murderer Ted Bundy.\n" +
                                "\n" +
                                "With a foreword from bestselling crime author Peter James, The Crime Book is an enthralling introduction to humanity's darker side.\n" +
                                "\n"
                    )
                )
                add(
                    BooksModel(
                        name = "VERITY [Paperback] Hoover, Colleen",
                        image = R.drawable.ic_verity,
                        detail = "Are you ready to stay up all night? Rebecca meets Gone Girl in this shocking, unpredictable thriller with a twist that will leave you reeling . . . The TikTok sensation from the author of It Ends With Us.Lowen Ashleigh is a struggling writer on the brink of financial ruin when she accepts the job offer of a lifetime. Jeremy Crawford, husband of bestselling author Verity Crawford, has hired Lowen to complete the remaining books in a successful series his injured wife is unable to finish. Lowen arrives at the Crawford home, ready to sort through years of Verity's notes and outlines, hoping to find enough material to get her started. What Lowen doesn't expect to uncover in the chaotic office is an unfinished autobiography Verity never intended for anyone to read. Page after page of bone-chilling admissions, including Verity's recollection of the night their family was forever altered. Lowen decides to keep the manuscript hidden from Jeremy, knowing its contents would devastate the already-grieving father. But as Lowen's feelings for Jeremy begin to intensify, she recognizes all the ways she could benefit if he were to read his wife's words. After all, no matter how devoted Jeremy is to his injured wife, a truth this horrifying would make it impossible for him to continue loving her . . .200,000 READERS HAVE ALREADY GIVEN VERITY FIVE STARS'One of the best thrillers I have ever read' *****'Powerful, mind-blowing and emotional' *****'The plot twists and that ending came out of nowhere' *****'There are no words. Bravo' *****'Dark, creepy, and one hundred per cent original' *****'I NEEDED to know how this was going to end' *****'Left me completely speechless' *****"
                    )
                )
            }))
            add(CategoryModel("Drama", image = R.drawable.ic_drama, booksList = ArrayList<BooksModel>().apply {
                add(
                    BooksModel(
                        name = "Drama Pb [Paperback] Raina Telgemeier",
                        image = R.drawable.ic_drama_pb,
                        detail = "Reading books is a kind of enjoyment. Reading books is a good habit. We bring you a different kinds of books. You can carry this book where ever you want. It is easy to carry. It can be an ideal gift to yourself and to your loved ones. Care instruction keep away from fire."
                    )
                )
                add(
                    BooksModel(
                        name = "Cambridge IGCSE (TM) Drama Student's Book",
                        image = R.drawable.ic_cambridge,
                        detail = "Prepare for the Cambridge IGCSE Drama 2022 syllabus with an approach that helps to create a varied, stimulating and enjoyable learning environment that enables students of different confidence and ability levels to flourish.Exam Board: Cambridge Assessment International EducationFirst teaching: 2020 First examination: 2022Be ready to teach the Cambridge IGCSE Drama syllabus with the second edition of this popular series.Have full confidence in the content and approach of the series which is written by a team of highly experienced authors, who have over 20 years of teaching experience.Enable students to learn a range of skills, such as how to build their self-awareness and how to reflect on their performance. This will build their knowledge and self-confidence, which extends beyond the course itself and helps equip them for life.Know that the series has an international feel in terms of both language used within the text, and plays, scenarios and contexts selected.Make use of the excellent supporting components of the series which include a range of exciting and engaging scripts from real plays, role plays for warm ups, examples of stimuli for devised pieces, and still images from productions which show key elements from performances.Help students monitor their learning using the ‘Learning Log’ and ‘Check your progress’ features, where students review, record and evaluate their work.The second edition includes a new focus on extending the repertoire, including site-specific and immersive theatre, as well as extra support for writing about texts in performance.This title is endorsed by Cambridge Assessment International Education.\n"
                    )
                )
                add(
                    BooksModel(
                        name = "The Drama Book: Lesson Plans, Activities, and Scripts for English-Language Learners",
                        image = R.drawable.ic_drama_book,
                        detail = "Everything you need to get dramatic in the classroom\n" +
                                "\n" +
                                "This easy-to-use, comprehensive teacher-resource book has lesson plans and practical activities that integrate theater into language learning. Plus ten original scripts so you can put the activities into action immediately! Drama and play scripts can be used to teach pronunciation, pragmatics, and other communication skills, as well as provide grammar and vocabulary practice!\n" +
                                "\n" +
                                "Conveniently organized into two parts, Part 1 includes pragmatics mini-lessons, community builders, drama games, and pronunciation activities. There are also lesson plans for producing a play (either fully-staged or as Reader's Theater), as well as guidelines and activities for writing plays to use with (or without students, ) and suggestions for integrating academic content. You'll even find rubrics and evaluation schemes for giving notes and feedback.\n" +
                                "\n" +
                                "Part 2 includes 10 original monologues and scripts of varying lengths that can be photocopied and used in the classroom. Specifically designed to feature everyday language and high frequency social interactions, these scenes and sketches follow engaging plot arcs in which characters face obstacles and strive to achieve objectives.\n" +
                                "\n" +
                                "With a foreword by Ken Wilson, this book is a must-have for anyone interested in using the performing arts to help students become more confident and fluent speakers.\n" +
                                "\n"
                    )
                )
                add(
                    BooksModel(
                        name = "A Flair for Drama (The Sadie Kramer Flair Mysteries Book 2)",
                        image = R.drawable.ic_flair,
                        detail = "When a former schoolmate invites flamboyant senior sleuth Sadie Kramer to a theatre production, she jumps at the excuse to visit the Monterey Bay area for a weekend. With quaint Carmel shops a short drive away and luxurious linens in her hotel accommodations, the excursion promises to be both entertaining and relaxing.\n" +
                                "\n" +
                                "Plenty of action is expected on stage, but when the show's leading lady turns up dead, Sadie finds herself faced with more than one drama to follow. With both cast members and production crew as potential suspects, will Sadie and her sidekick Yorkie, Coco, be able to solve the case?"
                    )
                )
            }))
            add(CategoryModel("Fantasy", image = R.drawable.ic_fantasy, booksList = ArrayList<BooksModel>().apply {
                add(
                    BooksModel(
                        name = "Faebound: Book 1 in the enchanting new fantasy series from Sunday Times bestselling author of The Final Strife",
                        image = R.drawable.ic_faebound,
                        detail = "THE INSTANT #1 SUNDAY TIMES BESTSELLER\n" +
                                "\n" +
                                "‘A romantic fantasy of epic proportions, crackling with magic and passion’ SAMANTHA SHANNON, bestselling author of The Priory of the Orange Tree\n" +
                                "\n" +
                                "‘A devastatingly romantic and breathtaking fantasy – opulent and sweeping, this book is unforgettable’ TASHA SURI, award-winning author of The Jasmine Throne\n" +
                                "\n" +
                                "'A layered romantasy novel that interrogates the nature of legends through non-stop plot twists'Good Housekeeping\n" +
                                "\n" +
                                "DIVIDED BY BLOOD.\n" +
                                "\n" +
                                "IMPRISONED BY FATE.\n" +
                                "\n" +
                                "BOUND BY DESIRE.\n" +
                                "\n" +
                                "WELCOME TO THE INTOXICATING WORLD OF THE FAE.\n" +
                                "\n" +
                                "Yeeran is a warrior in the elven army and has known nothing but violence her whole life. Her sister, Lettle, is trying to make a living as a diviner, seeking prophecies of a better future.\n" +
                                "\n" +
                                "When a fatal mistake leads to Yeeran’s exile from the Elven lands, they are both forced into the terrifying wilderness beyond their borders. There they encounter the impossible: the fae court.\n" +
                                "\n" +
                                "The fae haven’t been seen for a millennium. But now Yeeran and Lettle are thrust into their seductive world – torn between their loyalty to each other, their elven homeland, and their hearts…\n" +
                                "\n" +
                                "DISCOVER THE DEVASTATINGLY ROMANTIC FANTASY READERS ARE GIVING FIVE STARS – AND THEIR HEARTS…\n" +
                                "\n" +
                                "‘A stunning new spin on fae that will leave you gasping … an epic romance that’s brimming with heart’ KATE DYLAN, bestselling author of Mindwalker\n" +
                                "\n" +
                                "‘The most imaginative take on a steamy faerie court I’ve read in forever, with a cascade of epic twists’ LAURA STEVEN, award-winning author of The Society for Soulless Girls"
                    )
                )
                add(
                    BooksModel(
                        name = "The Lord of the Rings Boxed Set: The Classic Bestselling Fantasy Novel",
                        image = R.drawable.ic_lord,
                        detail = "Begin your journey into Middle-earth. A New Legend Begins on Prime Video, in The Lord of the Rings: The Rings of Power."
                    )
                )
                add(
                    BooksModel(
                        name = "Girl Who Drank The Moon",
                        image = R.drawable.ic_drank,
                        detail = "THE NO 1 NEW YORK TIMES BESTSELLER AND NEWBERY MEDAL WINNER 'This beautifully written, darkly funny coming-of-age story will enchant and entertain' Daily Mail Every year, the people of the Protectorate leave a baby as an offering to the witch who lives in the forest. They hope this sacrifice will keep her from terrorizing their town. But the witch in the Forest, Xan, is in fact a good witch who shares her home with a wise Swamp Monster and a Perfectly Tiny Dragon. Xan rescues the children and delivers them to welcoming families on the other side of the forest, nourishing the babies with starlight on the journey. One year, Xan accidentally feeds a baby moonlight instead of starlight, filling the ordinary child with extraordinary magic. Xan decides she must raise this girl, whom she calls Luna, as her own. As Luna's thirteenth birthday approaches, her magic begins to emerge - with dangerous consequences. Meanwhile, a young man from the Protectorate is determined to free his people by killing the witch. Deadly birds with uncertain intentions flock nearby. A volcano, quiet for centuries, rumbles just beneath the earth's surface. And the woman with the Tiger's heart is on the prowl . . . The Newbery Medal winner from the author of the highly acclaimed novel The Witch's Boy."
                    )
                )
                add(
                    BooksModel(
                        name = "RED QUEEN: RED QUEEN BOOK 1",
                        image = R.drawable.ic_red_queen,
                        detail = "This is a world divided by blood - red or silver.The Reds are commoners, ruled by a Silver elite in possession of god-like superpowers. And to Mare Barrow, a seventeen-year-old Red girl from the poverty-stricken Stilts, it seems like nothing will ever change.That is, until she finds herself working in the Silver Palace. Here, surrounded by the people she hates the most, Mare discovers that, despite her red blood, she possesses a deadly power of her own. One that threatens to destroy the balance of power.Fearful of Mare's potential, the Silvers hide her in plain view, declaring her a long-lost Silver princess, now engaged to a Silver prince. Despite knowing that one misstep would mean her death, Mare works silently to help the Red Guard, a militant resistance group, and bring down the Silver regime.But this is a world of betrayal and lies, and Mare has entered a dangerous dance - Reds against Silvers, prince against prince, and Mare against her own heart . A Children?s Bookshelf Selection: Each month our editor?s pick the best books for children and young adults by age to be a part of the children?s bookshelf. These are editorial recommendations made by our team of experts. Our monthly reading list includes a mix of bestsellers and top new releases and evergreen books that will help enhance a child?s reading life."
                    )
                )
            }))
            add(CategoryModel("Horror", image = R.drawable.ic_horror, booksList = ArrayList<BooksModel>().apply {
                add(
                    BooksModel(
                        name = "Dracula (Deluxe Hardbound Edition)",
                        image = R.drawable.ic_dracula,
                        detail = "This is a beautiful hardbound edition of Dracula that comes with gilded edges and elegantly designed endpapers. Dracula is an epistolary novel, written as a collection of realistic but completely fictional diary entries, telegrams, letters, ship’s logs, and newspaper clippings, all of which add a level of detailed realism to Stoker’s story. At the time of its publication, Dracula was considered a ‘straightforward horror novel’ based on imaginary creations of supernatural life. Dracula has been assigned to many literary genres including vampire literature, horror fiction, the gothic novel, and invasion literature. The novel touches on themes such as the role of women in Victorian culture, sexual conventions, immigration, colonialism, and post-colonialism. Although Stoker did not invent the vampire, he defined its modern form through this novel."
                    )
                )
                add(
                    BooksModel(
                        name = "Tales of Horror by Nikesh Murali “Creator of Indian Noir” ",
                        image = R.drawable.ic_tales,
                        detail = "Prepare to immerse yourself into the heart of darkness as Nikesh Murali, Commonwealth Short Story Prize-winning author and creator of India’ s most critically acclaimed horror podcast Indian Noir weaves an unforgettable tapestry of bone-chilling scares and unrelenting terror. Whether you're a seasoned horror enthusiast or a newcomer to the genre, this anthology is sure to satisfy your cravings for all things terrifying.• By the host of the no. 1 podcast ‘ Indian Noir’ • A collection of unique and original horror stories• Features immersive world-building, creating a sense of place and atmosphere that can transport readers to a different time, place, or even dimension• Explores deeper themes, such as trauma, fear, and mortality• Generates a powerful emotional response in readers"
                    )
                )
                add(
                    BooksModel(
                        name = "Ghosts of The Silent Hills",
                        image = R.drawable.ic_ghost,
                        detail = "The dead do not rest till they get what they want. You have arrived in the hills. In here, you are surrounded by dense, menacing forests, enveloped in a deadly silence... You never know what lurks here in the Cold, dark night. Do not walk alone after sunset in the hills. A beautiful woman in white haunts the Lonely pathways, looking to enchant and ensnare men... All the people who died in accidents here... They say you hear their screams at night. And the deserted lodges sitting amidst lush greenery and calm streams... Spirits lie in wait here, ready to prey on the living. There are sceptics who did not heed these warnings. They tried to rationalize what they saw, what they felt. But when they came face to face with the beings that they believed didn’t exist, they couldn’t run away anymore... Ghosts of the silent hills is a collection that will make your nights a little scarier, encompassing the very best spine-chilling stories based on true hauntings."
                    )
                )
                add(
                    BooksModel(
                        name = "That Night: Four Friends, Twenty Years",
                        image = R.drawable.ic_night,
                        detail = "Natasha, Riya, Anjali and Katherine were best friends in college - each different from the other yet inseparable - until that night.\n" +
                                "\n" +
                                "It was the night that began with a bottle of whisky and a game of Ouija but ended with the death of Sania, their unlikeable hostel mate. The friends vowed never to discuss that fateful night, a pact that had kept their friendship and guilt dormant for the last twenty years.\n" +
                                "\n" +
                                "But now, someone has begun to mess with them, threatening to reveal the truth that only Sania knew. Is it a hacker playing on their guilt or has Sania's ghost really returned to avenge her death?\n" +
                                "\n" +
                                "As the faceless enemy closes in on them, the friends come together once again to recount what really happened that night. But when the story is retold by each of them, the pieces don't fit. Because none of them is telling the whole truth . . .\n" +
                                "\n" +
                                "That Night is a dark, twisted tale of friendship and betrayal that draws you in and confounds you at every turn."
                    )
                )
            }))
            add(CategoryModel("Mystery", image = R.drawable.ic_mistery, booksList = ArrayList<BooksModel>().apply {
                add(
                    BooksModel(
                        name = "Faebound: Book 1 in the enchanting new fantasy series from Sunday Times bestselling author of The Final Strife",
                        image = R.drawable.ic_faebound,
                        detail = "THE INSTANT #1 SUNDAY TIMES BESTSELLER\n" +
                                "\n" +
                                "‘A romantic fantasy of epic proportions, crackling with magic and passion’ SAMANTHA SHANNON, bestselling author of The Priory of the Orange Tree\n" +
                                "\n" +
                                "‘A devastatingly romantic and breathtaking fantasy – opulent and sweeping, this book is unforgettable’ TASHA SURI, award-winning author of The Jasmine Throne\n" +
                                "\n" +
                                "'A layered romantasy novel that interrogates the nature of legends through non-stop plot twists'Good Housekeeping\n" +
                                "\n" +
                                "DIVIDED BY BLOOD.\n" +
                                "\n" +
                                "IMPRISONED BY FATE.\n" +
                                "\n" +
                                "BOUND BY DESIRE.\n" +
                                "\n" +
                                "WELCOME TO THE INTOXICATING WORLD OF THE FAE.\n" +
                                "\n" +
                                "Yeeran is a warrior in the elven army and has known nothing but violence her whole life. Her sister, Lettle, is trying to make a living as a diviner, seeking prophecies of a better future.\n" +
                                "\n" +
                                "When a fatal mistake leads to Yeeran’s exile from the Elven lands, they are both forced into the terrifying wilderness beyond their borders. There they encounter the impossible: the fae court.\n" +
                                "\n" +
                                "The fae haven’t been seen for a millennium. But now Yeeran and Lettle are thrust into their seductive world – torn between their loyalty to each other, their elven homeland, and their hearts…\n" +
                                "\n" +
                                "DISCOVER THE DEVASTATINGLY ROMANTIC FANTASY READERS ARE GIVING FIVE STARS – AND THEIR HEARTS…\n" +
                                "\n" +
                                "‘A stunning new spin on fae that will leave you gasping … an epic romance that’s brimming with heart’ KATE DYLAN, bestselling author of Mindwalker\n" +
                                "\n" +
                                "‘The most imaginative take on a steamy faerie court I’ve read in forever, with a cascade of epic twists’ LAURA STEVEN, award-winning author of The Society for Soulless Girls"
                    )
                )
                add(
                    BooksModel(
                        name = "The Lord of the Rings Boxed Set: The Classic Bestselling Fantasy Novel",
                        image = R.drawable.ic_lord,
                        detail = "Begin your journey into Middle-earth. A New Legend Begins on Prime Video, in The Lord of the Rings: The Rings of Power."
                    )
                )
                add(
                    BooksModel(
                        name = "Girl Who Drank The Moon",
                        image = R.drawable.ic_drank,
                        detail = "THE NO 1 NEW YORK TIMES BESTSELLER AND NEWBERY MEDAL WINNER 'This beautifully written, darkly funny coming-of-age story will enchant and entertain' Daily Mail Every year, the people of the Protectorate leave a baby as an offering to the witch who lives in the forest. They hope this sacrifice will keep her from terrorizing their town. But the witch in the Forest, Xan, is in fact a good witch who shares her home with a wise Swamp Monster and a Perfectly Tiny Dragon. Xan rescues the children and delivers them to welcoming families on the other side of the forest, nourishing the babies with starlight on the journey. One year, Xan accidentally feeds a baby moonlight instead of starlight, filling the ordinary child with extraordinary magic. Xan decides she must raise this girl, whom she calls Luna, as her own. As Luna's thirteenth birthday approaches, her magic begins to emerge - with dangerous consequences. Meanwhile, a young man from the Protectorate is determined to free his people by killing the witch. Deadly birds with uncertain intentions flock nearby. A volcano, quiet for centuries, rumbles just beneath the earth's surface. And the woman with the Tiger's heart is on the prowl . . . The Newbery Medal winner from the author of the highly acclaimed novel The Witch's Boy."
                    )
                )
                add(
                    BooksModel(
                        name = "RED QUEEN: RED QUEEN BOOK 1",
                        image = R.drawable.ic_red_queen,
                        detail = "This is a world divided by blood - red or silver.The Reds are commoners, ruled by a Silver elite in possession of god-like superpowers. And to Mare Barrow, a seventeen-year-old Red girl from the poverty-stricken Stilts, it seems like nothing will ever change.That is, until she finds herself working in the Silver Palace. Here, surrounded by the people she hates the most, Mare discovers that, despite her red blood, she possesses a deadly power of her own. One that threatens to destroy the balance of power.Fearful of Mare's potential, the Silvers hide her in plain view, declaring her a long-lost Silver princess, now engaged to a Silver prince. Despite knowing that one misstep would mean her death, Mare works silently to help the Red Guard, a militant resistance group, and bring down the Silver regime.But this is a world of betrayal and lies, and Mare has entered a dangerous dance - Reds against Silvers, prince against prince, and Mare against her own heart . A Children?s Bookshelf Selection: Each month our editor?s pick the best books for children and young adults by age to be a part of the children?s bookshelf. These are editorial recommendations made by our team of experts. Our monthly reading list includes a mix of bestsellers and top new releases and evergreen books that will help enhance a child?s reading life."
                    )
                )
            }))
            add(CategoryModel("Science fiction", image = R.drawable.ic_science, booksList = ArrayList<BooksModel>().apply {
                add(
                    BooksModel(
                        name = "Dracula (Deluxe Hardbound Edition)",
                        image = R.drawable.ic_dracula,
                        detail = "This is a beautiful hardbound edition of Dracula that comes with gilded edges and elegantly designed endpapers. Dracula is an epistolary novel, written as a collection of realistic but completely fictional diary entries, telegrams, letters, ship’s logs, and newspaper clippings, all of which add a level of detailed realism to Stoker’s story. At the time of its publication, Dracula was considered a ‘straightforward horror novel’ based on imaginary creations of supernatural life. Dracula has been assigned to many literary genres including vampire literature, horror fiction, the gothic novel, and invasion literature. The novel touches on themes such as the role of women in Victorian culture, sexual conventions, immigration, colonialism, and post-colonialism. Although Stoker did not invent the vampire, he defined its modern form through this novel."
                    )
                )
                add(
                    BooksModel(
                        name = "Tales of Horror by Nikesh Murali “Creator of Indian Noir” ",
                        image = R.drawable.ic_tales,
                        detail = "Prepare to immerse yourself into the heart of darkness as Nikesh Murali, Commonwealth Short Story Prize-winning author and creator of India’ s most critically acclaimed horror podcast Indian Noir weaves an unforgettable tapestry of bone-chilling scares and unrelenting terror. Whether you're a seasoned horror enthusiast or a newcomer to the genre, this anthology is sure to satisfy your cravings for all things terrifying.• By the host of the no. 1 podcast ‘ Indian Noir’ • A collection of unique and original horror stories• Features immersive world-building, creating a sense of place and atmosphere that can transport readers to a different time, place, or even dimension• Explores deeper themes, such as trauma, fear, and mortality• Generates a powerful emotional response in readers"
                    )
                )
                add(
                    BooksModel(
                        name = "Ghosts of The Silent Hills",
                        image = R.drawable.ic_ghost,
                        detail = "The dead do not rest till they get what they want. You have arrived in the hills. In here, you are surrounded by dense, menacing forests, enveloped in a deadly silence... You never know what lurks here in the Cold, dark night. Do not walk alone after sunset in the hills. A beautiful woman in white haunts the Lonely pathways, looking to enchant and ensnare men... All the people who died in accidents here... They say you hear their screams at night. And the deserted lodges sitting amidst lush greenery and calm streams... Spirits lie in wait here, ready to prey on the living. There are sceptics who did not heed these warnings. They tried to rationalize what they saw, what they felt. But when they came face to face with the beings that they believed didn’t exist, they couldn’t run away anymore... Ghosts of the silent hills is a collection that will make your nights a little scarier, encompassing the very best spine-chilling stories based on true hauntings."
                    )
                )
                add(
                    BooksModel(
                        name = "That Night: Four Friends, Twenty Years",
                        image = R.drawable.ic_night,
                        detail = "Natasha, Riya, Anjali and Katherine were best friends in college - each different from the other yet inseparable - until that night.\n" +
                                "\n" +
                                "It was the night that began with a bottle of whisky and a game of Ouija but ended with the death of Sania, their unlikeable hostel mate. The friends vowed never to discuss that fateful night, a pact that had kept their friendship and guilt dormant for the last twenty years.\n" +
                                "\n" +
                                "But now, someone has begun to mess with them, threatening to reveal the truth that only Sania knew. Is it a hacker playing on their guilt or has Sania's ghost really returned to avenge her death?\n" +
                                "\n" +
                                "As the faceless enemy closes in on them, the friends come together once again to recount what really happened that night. But when the story is retold by each of them, the pieces don't fit. Because none of them is telling the whole truth . . .\n" +
                                "\n" +
                                "That Night is a dark, twisted tale of friendship and betrayal that draws you in and confounds you at every turn."
                    )
                )
            }))
        }
    }
    override fun onCreate() {
        super.onCreate()
    }
}