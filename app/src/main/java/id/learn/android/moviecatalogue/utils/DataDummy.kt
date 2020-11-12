package id.learn.android.moviecatalogue.utils

import android.util.Log
import id.learn.android.moviecatalogue.R
import id.learn.android.moviecatalogue.data.MovieEntitiy
import id.learn.android.moviecatalogue.data.TvShowEntitiy
import id.learn.android.moviecatalogue.data.source.remote.response.MovieItem
import id.learn.android.moviecatalogue.data.source.remote.response.TmdbMovieResponse
import id.learn.android.moviecatalogue.data.source.remote.response.TvShowItem
import id.learn.android.moviecatalogue.network.ApiClient
import id.learn.android.moviecatalogue.network.ApiService

object DataDummy {


    fun generateDummyMovies(): List<MovieEntitiy> {


        val movies = ArrayList<MovieEntitiy>()
        movies.add(
            MovieEntitiy(
                635302,
                "1380.001".toFloat(),
                "劇場版「鬼滅の刃」無限列車編劇場版「鬼滅の刃」無限列車編",
                "ja",
                "/h8Rb9gBr48ODIwYUttZNYeMWeUU.jpg",
                "2020-10-16",
                "Tanjirō Kamado, joined with Inosuke Hashibira, a boy raised by boars who wears a boar's head, and Zenitsu Agatsuma, a scared boy who reveals his true power when he sleeps, boards the Infinity Train on a new mission with the Fire Hashira, Kyōjurō Rengoku, to defeat a demon who has been tormenting the people and killing the demon slayers who oppose it!",
                "6.1".toFloat()
            )
        )
        movies.add(
            MovieEntitiy(
                531219,
                "1661.695".toFloat(),
                "Roald Dahl's The Witches",
                "en",
                "/betExZlgK0l7CZ9CsCBVcwO1OjL.jpg",
                "2020-10-26",
                "In late 1967, a young orphaned boy goes to live with his loving grandma in the rural Alabama town of Demopolis. As the boy and his grandmother encounter some deceptively glamorous but thoroughly diabolical witches, she wisely whisks him away to a seaside resort. Regrettably, they arrive at precisely the same time that the world's Grand High Witch has",
                "7".toFloat()
            )
        )
        movies.add(
            MovieEntitiy(
                724989,
                "1732.713".toFloat(),
                "Hard Kill",
                "en",
                "/ugZW8ocsrfgI95pnQ7wrmKDxIe.jpg",
                "2020-10-23",
                "The work of billionaire tech CEO Donovan Chalmers is so valuable that he hires mercenaries to protect it, and a terrorist group kidnaps his daughter just to get it.",
                "5".toFloat()
            )
        )
        movies.add(
            MovieEntitiy(
                400160,
                "1560.835".toFloat(),
                "The SpongeBob Movie: Sponge on the Run",
                "en",
                "/jlJ8nDhMhCYJuzOw3f52CP1W8MW.jpg",
                "2020-08-14",
                "When his best friend Gary is suddenly snatched away, SpongeBob takes Patrick on a madcap mission far beyond Bikini Bottom to save their pink-shelled pal.",
                "8.3".toFloat()
            )
        )
        movies.add(
            MovieEntitiy(
                528085,
                "1286.086".toFloat(),
                "2067",
                "en",
                "/7D430eqZj8y3oVkLFfsWXGRcpEG.jpg",
                "2020-10-01",
                "A lowly utility worker is called to the future by a mysterious radio signal, he must leave his dying wife to embark on a journey that will force him to face his deepest fears in an attempt to change the fabric of reality and save humankind from its greatest environmental crisis yet.",
                "4.9".toFloat()
            )
        )
        movies.add(
            MovieEntitiy(
                741074,
                "1075.075".toFloat(),
                "Once Upon a Snowman",
                "en",
                "/hddzYJtfYYeMDOQVcH58n8m1W3A.jpg",
                "2020-10-23",
                "The previously untold origins of Olaf, the innocent and insightful, summer-loving snowman are revealed as we follow Olaf’s first steps as he comes to life and searches for his identity in the snowy mountains outside Arendelle.",
                "7.3".toFloat()
            )
        )
        movies.add(
            MovieEntitiy(
                741067,
                "903.538".toFloat(),
                "Welcome to Sudden Death",
                "en",
                "/elZ6JCzSEvFOq4gNjNeZsnRFsvj.jpg",
                "2020-09-29",
                "Jesse Freeman is a former special forces officer and explosives expert now working a regular job as a security guard in a state-of-the-art basketball arena. Trouble erupts when a tech-savvy cadre of terrorists kidnap the team's owner and Jesse's daughter during opening night. Facing a ticking clock and impossible odds, it's up to Jesse to not only save them but also a full house of fans in this highly charged action thriller.",
                "6.3".toFloat()
            )
        )
        movies.add(
            MovieEntitiy(
                560050,
                "796.405".toFloat(),
                "Over the Moon",
                "en",
                "/lQfdytwN7eh0tXWjIiMceFdBBvD.jpg",
                "2020-10-16",
                "A girl builds a rocket to travel to the moon in hopes of meeting the legendary Moon Goddess.",
                "7.7".toFloat()
            )
        )
        movies.add(
            MovieEntitiy(
                497582,
                "800.607".toFloat(),
                "Enola Holmes",
                "en",
                "/riYInlsq2kf1AWoGm80JQW5dLKp.jpg",
                "2020-09-23",
                "While searching for her missing mother, intrepid teen Enola Holmes uses her sleuthing skills to outsmart big brother Sherlock and help a runaway lord.",
                "7.5".toFloat()
            )
        )
        movies.add(
            MovieEntitiy(
                671039,
                "1158.648".toFloat(),
                "Bronx",
                "fr",
                "/9HT9982bzgN5on1sLRmc1GMn6ZC.jpg",
                "2020-10-30",
                "Caught in the crosshairs of police corruption and Marseille’s warring gangs, a loyal cop must protect his squad by taking matters into his own hands.",
                "6.4".toFloat()
            )
        )
        movies.add(
            MovieEntitiy(
                740985,
                "681.016".toFloat(),
                "Borat Subsequent Moviefilm",
                "fr",
                "/6agKYU5IQFpuDyUYPu39w7UCRrJ.jpg",
                "2020-10-23",
                "14 years after making a film about his journey across the USA, Borat risks life and limb when he returns to the United States with his young daughter, and reveals more about the culture, the COVID-19 pandemic, and the political elections.",
                "6.7".toFloat()
            )
        )
        movies.add(
            MovieEntitiy(
                581392,
                "744.918".toFloat(),
                "반도",
                "ko",
                "/sy6DvAu72kjoseZEjocnm2ZZ09i.jpg",
                "2020-07-15",
                "A soldier and his team battle hordes of post-apocalyptic zombies in the wastelands of the Korean Peninsula.",
                "7".toFloat()
            )
        )
        movies.add(
            MovieEntitiy(
                337401,
                "657.875".toFloat(),
                "Mulan",
                "en",
                "/aKx1ARwG55zZ0GpRvU2WrGrCG9o.jpg",
                "2020-09-04",
                "When the Emperor of China issues a decree that one man per family must serve in the Imperial Chinese Army to defend the country from Huns, Hua Mulan, the eldest daughter of an honored warrior, steps in to take the place of her ailing father. She is spirited, determined and quick on her feet. Disguised as a man by the name of Hua Jun, she is tested every step of the way and must harness her innermost strength and embrace her true potential.",
                "7.2".toFloat()
            )
        )
        movies.add(
            MovieEntitiy(
                694919,
                "645.159".toFloat(),
                "Money Plane",
                "en",
                "/6CoRTJTmijhBLJTUNoVSUNxZMEI.jpg",
                "2020-09-29",
                "A professional thief with \$40 million in debt and his family's life on the line must commit one final heist - rob a futuristic airborne casino filled with the world's most dangerous criminals.",
                "5.9".toFloat()
            )
        )
        movies.add(
            MovieEntitiy(
                340102,
                "672.384".toFloat(),
                "The New Mutants",
                "en",
                "/xrI4EnZWftpo1B7tTvlMUXVOikd.jpg",
                "2020-08-26",
                "Five young mutants, just discovering their abilities while held in a secret facility against their will, fight to escape their past sins and save themselves.",
                "6.3".toFloat()
            )
        )
        movies.add(
            MovieEntitiy(
                539885,
                "582.577".toFloat(),
                "Ava",
                "en",
                "/qzA87Wf4jo1h8JMk9GilyIYvwsA.jpg",
                "2020-07-02",
                "A black ops assassin is forced to fight for her own survival after a job goes dangerously wrong.",
                "5.7".toFloat()
            )
        )
        movies.add(
            MovieEntitiy(
                677638,
                "570.995".toFloat(),
                "We Bare Bears: The Movie",
                "en",
                "/kPzcvxBwt7kEISB9O4jJEuBn72t.jpg",
                "2020-06-30",
                "When Grizz, Panda, and Ice Bear's love of food trucks and viral videos get out of hand, the brothers are chased away from their home and embark on a trip to Canada, where they can live in peace.",
                "7.7".toFloat()
            )
        )
        movies.add(
            MovieEntitiy(
                601844,
                "526.037".toFloat(),
                "Becky",
                "en",
                "/xqbQtMffXwa3oprse4jiHBMBvdW.jpg",
                "2020-07-23",
                "A teenager's weekend at a lake house with her father takes a turn for the worse when a group of convicts wreaks havoc on their lives.",
                "6.2".toFloat()
            )
        )
        movies.add(
            MovieEntitiy(
                613504,
                "772.708".toFloat(),
                "After We Collided",
                "en",
                "/kiX7UYfOpYrMFSAGbI6j1pFkLzQ.jpg",
                "2020-09-02",
                "Tessa finds herself struggling with her complicated relationship with Hardin; she faces a dilemma that could change their lives forever.",
                "7.4".toFloat()
            )
        )
        movies.add(
            MovieEntitiy(
                660982,
                "488.34".toFloat(),
                "American Pie Presents: Girls' Rules",
                "en",
                "/xqvX5A24dbIWaeYsMTxxKX5qOfz.jpg",
                "2020-10-06",
                "It's Senior year at East Great Falls. Annie, Kayla, Michelle, and Stephanie decide to harness their girl power and band together to get what they want their last year of high school.",
                "6.2".toFloat()
            )
        )
        return movies
    }

    fun generateRemoteDummyMovies(): List<MovieItem> {


        val movies = ArrayList<MovieItem>()
        movies.add(
            MovieItem(
                635302,
                "1380.001".toFloat(),
                "劇場版「鬼滅の刃」無限列車編劇場版「鬼滅の刃」無限列車編",
                "ja",
                "/h8Rb9gBr48ODIwYUttZNYeMWeUU.jpg",
                "2020-10-16",
                "Tanjirō Kamado, joined with Inosuke Hashibira, a boy raised by boars who wears a boar's head, and Zenitsu Agatsuma, a scared boy who reveals his true power when he sleeps, boards the Infinity Train on a new mission with the Fire Hashira, Kyōjurō Rengoku, to defeat a demon who has been tormenting the people and killing the demon slayers who oppose it!",
                "6.1".toFloat()
            )
        )
        movies.add(
            MovieItem(
                531219,
                "1661.695".toFloat(),
                "Roald Dahl's The Witches",
                "en",
                "/betExZlgK0l7CZ9CsCBVcwO1OjL.jpg",
                "2020-10-26",
                "In late 1967, a young orphaned boy goes to live with his loving grandma in the rural Alabama town of Demopolis. As the boy and his grandmother encounter some deceptively glamorous but thoroughly diabolical witches, she wisely whisks him away to a seaside resort. Regrettably, they arrive at precisely the same time that the world's Grand High Witch has",
                "7".toFloat()
            )
        )
        movies.add(
            MovieItem(
                724989,
                "1732.713".toFloat(),
                "Hard Kill",
                "en",
                "/ugZW8ocsrfgI95pnQ7wrmKDxIe.jpg",
                "2020-10-23",
                "The work of billionaire tech CEO Donovan Chalmers is so valuable that he hires mercenaries to protect it, and a terrorist group kidnaps his daughter just to get it.",
                "5".toFloat()
            )
        )
        movies.add(
            MovieItem(
                400160,
                "1560.835".toFloat(),
                "The SpongeBob Movie: Sponge on the Run",
                "en",
                "/jlJ8nDhMhCYJuzOw3f52CP1W8MW.jpg",
                "2020-08-14",
                "When his best friend Gary is suddenly snatched away, SpongeBob takes Patrick on a madcap mission far beyond Bikini Bottom to save their pink-shelled pal.",
                "8.3".toFloat()
            )
        )
        movies.add(
            MovieItem(
                528085,
                "1286.086".toFloat(),
                "2067",
                "en",
                "/7D430eqZj8y3oVkLFfsWXGRcpEG.jpg",
                "2020-10-01",
                "A lowly utility worker is called to the future by a mysterious radio signal, he must leave his dying wife to embark on a journey that will force him to face his deepest fears in an attempt to change the fabric of reality and save humankind from its greatest environmental crisis yet.",
                "4.9".toFloat()
            )
        )
        movies.add(
            MovieItem(
                741074,
                "1075.075".toFloat(),
                "Once Upon a Snowman",
                "en",
                "/hddzYJtfYYeMDOQVcH58n8m1W3A.jpg",
                "2020-10-23",
                "The previously untold origins of Olaf, the innocent and insightful, summer-loving snowman are revealed as we follow Olaf’s first steps as he comes to life and searches for his identity in the snowy mountains outside Arendelle.",
                "7.3".toFloat()
            )
        )
        movies.add(
            MovieItem(
                741067,
                "903.538".toFloat(),
                "Welcome to Sudden Death",
                "en",
                "/elZ6JCzSEvFOq4gNjNeZsnRFsvj.jpg",
                "2020-09-29",
                "Jesse Freeman is a former special forces officer and explosives expert now working a regular job as a security guard in a state-of-the-art basketball arena. Trouble erupts when a tech-savvy cadre of terrorists kidnap the team's owner and Jesse's daughter during opening night. Facing a ticking clock and impossible odds, it's up to Jesse to not only save them but also a full house of fans in this highly charged action thriller.",
                "6.3".toFloat()
            )
        )
        movies.add(
            MovieItem(
                560050,
                "796.405".toFloat(),
                "Over the Moon",
                "en",
                "/lQfdytwN7eh0tXWjIiMceFdBBvD.jpg",
                "2020-10-16",
                "A girl builds a rocket to travel to the moon in hopes of meeting the legendary Moon Goddess.",
                "7.7".toFloat()
            )
        )
        movies.add(
            MovieItem(
                497582,
                "800.607".toFloat(),
                "Enola Holmes",
                "en",
                "/riYInlsq2kf1AWoGm80JQW5dLKp.jpg",
                "2020-09-23",
                "While searching for her missing mother, intrepid teen Enola Holmes uses her sleuthing skills to outsmart big brother Sherlock and help a runaway lord.",
                "7.5".toFloat()
            )
        )
        movies.add(
            MovieItem(
                671039,
                "1158.648".toFloat(),
                "Bronx",
                "fr",
                "/9HT9982bzgN5on1sLRmc1GMn6ZC.jpg",
                "2020-10-30",
                "Caught in the crosshairs of police corruption and Marseille’s warring gangs, a loyal cop must protect his squad by taking matters into his own hands.",
                "6.4".toFloat()
            )
        )
        movies.add(
            MovieItem(
                740985,
                "681.016".toFloat(),
                "Borat Subsequent Moviefilm",
                "fr",
                "/6agKYU5IQFpuDyUYPu39w7UCRrJ.jpg",
                "2020-10-23",
                "14 years after making a film about his journey across the USA, Borat risks life and limb when he returns to the United States with his young daughter, and reveals more about the culture, the COVID-19 pandemic, and the political elections.",
                "6.7".toFloat()
            )
        )
        movies.add(
            MovieItem(
                581392,
                "744.918".toFloat(),
                "반도",
                "ko",
                "/sy6DvAu72kjoseZEjocnm2ZZ09i.jpg",
                "2020-07-15",
                "A soldier and his team battle hordes of post-apocalyptic zombies in the wastelands of the Korean Peninsula.",
                "7".toFloat()
            )
        )
        movies.add(
            MovieItem(
                337401,
                "657.875".toFloat(),
                "Mulan",
                "en",
                "/aKx1ARwG55zZ0GpRvU2WrGrCG9o.jpg",
                "2020-09-04",
                "When the Emperor of China issues a decree that one man per family must serve in the Imperial Chinese Army to defend the country from Huns, Hua Mulan, the eldest daughter of an honored warrior, steps in to take the place of her ailing father. She is spirited, determined and quick on her feet. Disguised as a man by the name of Hua Jun, she is tested every step of the way and must harness her innermost strength and embrace her true potential.",
                "7.2".toFloat()
            )
        )
        movies.add(
            MovieItem(
                694919,
                "645.159".toFloat(),
                "Money Plane",
                "en",
                "/6CoRTJTmijhBLJTUNoVSUNxZMEI.jpg",
                "2020-09-29",
                "A professional thief with \$40 million in debt and his family's life on the line must commit one final heist - rob a futuristic airborne casino filled with the world's most dangerous criminals.",
                "5.9".toFloat()
            )
        )
        movies.add(
            MovieItem(
                340102,
                "672.384".toFloat(),
                "The New Mutants",
                "en",
                "/xrI4EnZWftpo1B7tTvlMUXVOikd.jpg",
                "2020-08-26",
                "Five young mutants, just discovering their abilities while held in a secret facility against their will, fight to escape their past sins and save themselves.",
                "6.3".toFloat()
            )
        )
        movies.add(
            MovieItem(
                539885,
                "582.577".toFloat(),
                "Ava",
                "en",
                "/qzA87Wf4jo1h8JMk9GilyIYvwsA.jpg",
                "2020-07-02",
                "A black ops assassin is forced to fight for her own survival after a job goes dangerously wrong.",
                "5.7".toFloat()
            )
        )
        movies.add(
            MovieItem(
                677638,
                "570.995".toFloat(),
                "We Bare Bears: The Movie",
                "en",
                "/kPzcvxBwt7kEISB9O4jJEuBn72t.jpg",
                "2020-06-30",
                "When Grizz, Panda, and Ice Bear's love of food trucks and viral videos get out of hand, the brothers are chased away from their home and embark on a trip to Canada, where they can live in peace.",
                "7.7".toFloat()
            )
        )
        movies.add(
            MovieItem(
                601844,
                "526.037".toFloat(),
                "Becky",
                "en",
                "/xqbQtMffXwa3oprse4jiHBMBvdW.jpg",
                "2020-07-23",
                "A teenager's weekend at a lake house with her father takes a turn for the worse when a group of convicts wreaks havoc on their lives.",
                "6.2".toFloat()
            )
        )
        movies.add(
            MovieItem(
                613504,
                "772.708".toFloat(),
                "After We Collided",
                "en",
                "/kiX7UYfOpYrMFSAGbI6j1pFkLzQ.jpg",
                "2020-09-02",
                "Tessa finds herself struggling with her complicated relationship with Hardin; she faces a dilemma that could change their lives forever.",
                "7.4".toFloat()
            )
        )
        movies.add(
            MovieItem(
                660982,
                "488.34".toFloat(),
                "American Pie Presents: Girls' Rules",
                "en",
                "/xqvX5A24dbIWaeYsMTxxKX5qOfz.jpg",
                "2020-10-06",
                "It's Senior year at East Great Falls. Annie, Kayla, Michelle, and Stephanie decide to harness their girl power and band together to get what they want their last year of high school.",
                "6.2".toFloat()
            )
        )
        return movies
    }

    fun generateDummyTvshows(): List<TvShowEntitiy> {
        val tvshows = ArrayList<TvShowEntitiy>()
        tvshows.add(
            TvShowEntitiy(
                71712,
                "1262.912".toFloat(),
                "en",
                "The Good Doctor",
                "/6tfT03sGp9k4c0J3dypjrI8TSAI.jpg",
                "A young surgeon with Savant syndrome is recruited into the surgical unit of a prestigious hospital. The question will arise: can a person who doesn't have the ability to relate to people actually save their lives?",
                "2017-09-25",
                "8.6".toFloat()
            )
        )
        tvshows.add(
            TvShowEntitiy(
                82856,
                "1154.887".toFloat(),
                "en",
                "The Mandalorian",
                "/sWgBv7LV2PRoQgkxwlibdGXKz1S.jpg",
                "After the fall of the Galactic Empire, lawlessness has spread throughout the galaxy. A lone gunfighter makes his way through the outer reaches, earning his keep as a bounty hunter.",
                "2019-11-12",
                "8.5".toFloat()
            )
        )
        tvshows.add(
            TvShowEntitiy(
                62286,
                "726.736".toFloat(),
                "en",
                "Fear the Walking Dead",
                "/wGFUewXPeMErCe2xnCmmLEiHOGh.jpg",
                "What did the world look like as it was transforming into the horrifying apocalypse depicted in \"The Walking Dead\"? This spin-off set in Los Angeles, following new characters as they face the beginning of the end of the world, will answer that question.",
                "2015-08-23",
                "7.4".toFloat()
            )
        )
        tvshows.add(
            TvShowEntitiy(
                63174,
                "617.445".toFloat(),
                "en",
                "Lucifer",
                "/4EYPN5mVIhKLfxGruy7Dy41dTVn.jpg",
                "Bored and unhappy as the Lord of Hell, Lucifer Morningstar abandoned his throne and retired to Los Angeles, where he has teamed up with LAPD detective Chloe Decker to take down criminals. But the longer he's away from the underworld, the greater the threat that the worst of humanity could escape.",
                "2016-01-25",
                "8.5".toFloat()
            )
        )
        tvshows.add(
            TvShowEntitiy(
                76479,
                "523.915".toFloat(),
                "en",
                "The Boys",
                "/mY7SeH4HFFxW1hiI6cWuwCRKptN.jpg",
                "A group of vigilantes known informally as “The Boys” set out to take down corrupt superheroes with no more than blue-collar grit and a willingness to fight dirty.",
                "2019-07-25",
                "8.4".toFloat()
            )
        )
        tvshows.add(
            TvShowEntitiy(
                87739,
                "479.349".toFloat(),
                "en",
                "The Queen's Gambit",
                "/zU0htwkhNvBQdVSIKB9s6hgVeFK.jpg",
                "In a Kentucky orphanage in the 1950s, a young girl discovers an astonishing talent for chess while struggling with addiction.",
                "2020-10-23",
                "8.9".toFloat()
            )
        )
        tvshows.add(
            TvShowEntitiy(
                94305,
                "470.054".toFloat(),
                "en",
                "The Walking Dead: World Beyond",
                "/z31GxpVgDsFAF4paZR8PRsiP16D.jpg",
                "A heroic group of teens sheltered from the dangers of the post-apocalyptic world receive a message that inspires them to leave the safety of the only home they have ever known and embark on a cross-country journey to find the one man who can possibly save the world.",
                "2020-10-04",
                "7.7".toFloat()
            )
        )
        tvshows.add(
            TvShowEntitiy(
                1416,
                "406.915".toFloat(),
                "en",
                "Grey's Anatomy",
                "/clnyhPqj1SNgpAdeSS6a6fwE6Bo.jpg",
                "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                "2020-10-04",
                "8".toFloat()
            )
        )
        tvshows.add(
            TvShowEntitiy(
                456,
                "374.233".toFloat(),
                "en",
                "The Simpsons",
                "/2IWouZK4gkgHhJa3oyYuSWfSqbG.jpg",
                "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.",
                "1989-12-16",
                "7.7".toFloat()
            )
        )
        tvshows.add(
            TvShowEntitiy(
                48866,
                "359.245".toFloat(),
                "en",
                "The 100",
                "/wcaDIAG1QdXQLRaj4vC1EFdBT2.jpg",
                "100 years in the future, when the Earth has been abandoned due to radioactivity, the last surviving humans live on an ark orbiting the planet — but the ark won't last forever. So the repressive regime picks 100 expendable juvenile delinquents to send down to Earth to see if the planet is still habitable.",
                "2014-03-19",
                "7.8".toFloat()
            )
        )
        tvshows.add(
            TvShowEntitiy(
                1399,
                "348.393".toFloat(),
                "en",
                "Game of Thrones",
                "/u3bZgnGQ9T01sWNhyveQz0wH0Hl.jpg",
                "Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Night's Watch, is all that stands between the realms of men and icy horrors beyond.",
                "2011-04-17",
                "8.3".toFloat()
            )
        )
        tvshows.add(
            TvShowEntitiy(
                75006,
                "357.818".toFloat(),
                "en",
                "The Umbrella Academy",
                "/scZlQQYnDVlnpxFTxaIv2g0BWnL.jpg",
                "A dysfunctional family of superheroes comes together to solve the mystery of their father's death, the threat of the apocalypse and more.",
                "2019-02-15",
                "8.7".toFloat()
            )
        )
        tvshows.add(
            TvShowEntitiy(
                18165,
                "337.107".toFloat(),
                "en",
                "The Vampire Diaries",
                "/aBkVgChtyyJaHyZh1gfd8DbzQon.jpg",
                "The story of two vampire brothers obsessed with the same girl, who bears a striking resemblance to the beautiful but ruthless vampire they knew and loved in 1864.",
                "2009-09-10",
                "8.3".toFloat()
            )
        )
        tvshows.add(
            TvShowEntitiy(
                69050,
                "326.896".toFloat(),
                "en",
                "Riverdale",
                "/4X7o1ssOEvp4BFLim1AZmPNcYbU.jpg",
                "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                "2017-01-26",
                "8.6".toFloat()
            )
        )
        tvshows.add(
            TvShowEntitiy(
                1622,
                "330.467".toFloat(),
                "en",
                "Supernatural",
                "/KoYWXbnYuS3b0GyQPkbuexlVK9.jpg",
                "When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way.",
                "2005-09-13",
                "8.1".toFloat()
            )
        )
        tvshows.add(
            TvShowEntitiy(
                77169,
                "256.771".toFloat(),
                "en",
                "Cobra Kai",
                "/eTMMU2rKpZRbo9ERytyhwatwAjz.jpg",
                "This Karate Kid sequel series picks up 30 years after the events of the 1984 All Valley Karate Tournament and finds Johnny Lawrence on the hunt for redemption by reopening the infamous Cobra Kai karate dojo. This reignites his old rivalry with the successful Daniel LaRusso, who has been working to maintain the balance in his life without mentor Mr. Miyagi.",
                "2018-05-02",
                "8".toFloat()
            )
        )
        tvshows.add(
            TvShowEntitiy(
                1402,
                "316.766".toFloat(),
                "en",
                "The Walking Dead",
                "/qgjP2OrrX9gc6M270xdPnEmE9tC.jpg",
                "Sheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way.",
                "2010-10-31",
                "7.9".toFloat()
            )
        )
        tvshows.add(
            TvShowEntitiy(
                68507,
                "430.44".toFloat(),
                "en",
                "His Dark Materials",
                "/g6tIKGc3f1H5QMz1dcgCwADKpZ7.jpg",
                "Lyra is an orphan who lives in a parallel universe in which science, theology and magic are entwined. Lyra's search for a kidnapped friend uncovers a sinister plot involving stolen children, and turns into a quest to understand a mysterious phenomenon called Dust. She is later joined on her journey by Will, a boy who possesses a knife that can cut windows between worlds. As Lyra learns the truth about her parents and her prophesied destiny, the two young people are caught up in a war against celestial powers that ranges across many worlds.",
                "2019-11-03",
                "8.1".toFloat()
            )
        )
        tvshows.add(
            TvShowEntitiy(
                91605,
                "289.684".toFloat(),
                "en",
                "His Dark Materials",
                "/oogunE22HDTcTxFakKQbwqfw1qo.jpg",
                "Each hour-long film follows a different women as they experience “moments that are emotionally raw, thought-provoking and utterly personal”.",
                "2019-07-23",
                "4.8".toFloat()
            )
        )
        tvshows.add(
            TvShowEntitiy(
                1911,
                "268.797".toFloat(),
                "en",
                "Bones",
                "/1bwF1daWnsEYYjbHXiEMdS587fR.jpg",
                "Dr. Temperance Brennan and her colleagues at the Jeffersonian's Medico-Legal Lab assist Special Agent Seeley Booth with murder investigations when the remains are so badly decomposed, burned or destroyed that the standard identification methods are useless.",
                "2005-09-13",
                "8.1".toFloat()
            )
        )
        return tvshows
    }

    fun generateRemoteDummyTvshows(): List<TvShowItem> {
        val tvshows = ArrayList<TvShowItem>()
        tvshows.add(
            TvShowItem(
                71712,
                "1262.912".toFloat(),
                "en",
                "The Good Doctor",
                "/6tfT03sGp9k4c0J3dypjrI8TSAI.jpg",
                "A young surgeon with Savant syndrome is recruited into the surgical unit of a prestigious hospital. The question will arise: can a person who doesn't have the ability to relate to people actually save their lives?",
                "2017-09-25",
                "8.6".toFloat()
            )
        )
        tvshows.add(
            TvShowItem(
                82856,
                "1154.887".toFloat(),
                "en",
                "The Mandalorian",
                "/sWgBv7LV2PRoQgkxwlibdGXKz1S.jpg",
                "After the fall of the Galactic Empire, lawlessness has spread throughout the galaxy. A lone gunfighter makes his way through the outer reaches, earning his keep as a bounty hunter.",
                "2019-11-12",
                "8.5".toFloat()
            )
        )
        tvshows.add(
            TvShowItem(
                62286,
                "726.736".toFloat(),
                "en",
                "Fear the Walking Dead",
                "/wGFUewXPeMErCe2xnCmmLEiHOGh.jpg",
                "What did the world look like as it was transforming into the horrifying apocalypse depicted in \"The Walking Dead\"? This spin-off set in Los Angeles, following new characters as they face the beginning of the end of the world, will answer that question.",
                "2015-08-23",
                "7.4".toFloat()
            )
        )
        tvshows.add(
            TvShowItem(
                63174,
                "617.445".toFloat(),
                "en",
                "Lucifer",
                "/4EYPN5mVIhKLfxGruy7Dy41dTVn.jpg",
                "Bored and unhappy as the Lord of Hell, Lucifer Morningstar abandoned his throne and retired to Los Angeles, where he has teamed up with LAPD detective Chloe Decker to take down criminals. But the longer he's away from the underworld, the greater the threat that the worst of humanity could escape.",
                "2016-01-25",
                "8.5".toFloat()
            )
        )
        tvshows.add(
            TvShowItem(
                76479,
                "523.915".toFloat(),
                "en",
                "The Boys",
                "/mY7SeH4HFFxW1hiI6cWuwCRKptN.jpg",
                "A group of vigilantes known informally as “The Boys” set out to take down corrupt superheroes with no more than blue-collar grit and a willingness to fight dirty.",
                "2019-07-25",
                "8.4".toFloat()
            )
        )
        tvshows.add(
            TvShowItem(
                87739,
                "479.349".toFloat(),
                "en",
                "The Queen's Gambit",
                "/zU0htwkhNvBQdVSIKB9s6hgVeFK.jpg",
                "In a Kentucky orphanage in the 1950s, a young girl discovers an astonishing talent for chess while struggling with addiction.",
                "2020-10-23",
                "8.9".toFloat()
            )
        )
        tvshows.add(
            TvShowItem(
                94305,
                "470.054".toFloat(),
                "en",
                "The Walking Dead: World Beyond",
                "/z31GxpVgDsFAF4paZR8PRsiP16D.jpg",
                "A heroic group of teens sheltered from the dangers of the post-apocalyptic world receive a message that inspires them to leave the safety of the only home they have ever known and embark on a cross-country journey to find the one man who can possibly save the world.",
                "2020-10-04",
                "7.7".toFloat()
            )
        )
        tvshows.add(
            TvShowItem(
                1416,
                "406.915".toFloat(),
                "en",
                "Grey's Anatomy",
                "/clnyhPqj1SNgpAdeSS6a6fwE6Bo.jpg",
                "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                "2020-10-04",
                "8".toFloat()
            )
        )
        tvshows.add(
            TvShowItem(
                456,
                "374.233".toFloat(),
                "en",
                "The Simpsons",
                "/2IWouZK4gkgHhJa3oyYuSWfSqbG.jpg",
                "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.",
                "1989-12-16",
                "7.7".toFloat()
            )
        )
        tvshows.add(
            TvShowItem(
                48866,
                "359.245".toFloat(),
                "en",
                "The 100",
                "/wcaDIAG1QdXQLRaj4vC1EFdBT2.jpg",
                "100 years in the future, when the Earth has been abandoned due to radioactivity, the last surviving humans live on an ark orbiting the planet — but the ark won't last forever. So the repressive regime picks 100 expendable juvenile delinquents to send down to Earth to see if the planet is still habitable.",
                "2014-03-19",
                "7.8".toFloat()
            )
        )
        tvshows.add(
            TvShowItem(
                1399,
                "348.393".toFloat(),
                "en",
                "Game of Thrones",
                "/u3bZgnGQ9T01sWNhyveQz0wH0Hl.jpg",
                "Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Night's Watch, is all that stands between the realms of men and icy horrors beyond.",
                "2011-04-17",
                "8.3".toFloat()
            )
        )
        tvshows.add(
            TvShowItem(
                75006,
                "357.818".toFloat(),
                "en",
                "The Umbrella Academy",
                "/scZlQQYnDVlnpxFTxaIv2g0BWnL.jpg",
                "A dysfunctional family of superheroes comes together to solve the mystery of their father's death, the threat of the apocalypse and more.",
                "2019-02-15",
                "8.7".toFloat()
            )
        )
        tvshows.add(
            TvShowItem(
                18165,
                "337.107".toFloat(),
                "en",
                "The Vampire Diaries",
                "/aBkVgChtyyJaHyZh1gfd8DbzQon.jpg",
                "The story of two vampire brothers obsessed with the same girl, who bears a striking resemblance to the beautiful but ruthless vampire they knew and loved in 1864.",
                "2009-09-10",
                "8.3".toFloat()
            )
        )
        tvshows.add(
            TvShowItem(
                69050,
                "326.896".toFloat(),
                "en",
                "Riverdale",
                "/4X7o1ssOEvp4BFLim1AZmPNcYbU.jpg",
                "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                "2017-01-26",
                "8.6".toFloat()
            )
        )
        tvshows.add(
            TvShowItem(
                1622,
                "330.467".toFloat(),
                "en",
                "Supernatural",
                "/KoYWXbnYuS3b0GyQPkbuexlVK9.jpg",
                "When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way.",
                "2005-09-13",
                "8.1".toFloat()
            )
        )
        tvshows.add(
            TvShowItem(
                77169,
                "256.771".toFloat(),
                "en",
                "Cobra Kai",
                "/eTMMU2rKpZRbo9ERytyhwatwAjz.jpg",
                "This Karate Kid sequel series picks up 30 years after the events of the 1984 All Valley Karate Tournament and finds Johnny Lawrence on the hunt for redemption by reopening the infamous Cobra Kai karate dojo. This reignites his old rivalry with the successful Daniel LaRusso, who has been working to maintain the balance in his life without mentor Mr. Miyagi.",
                "2018-05-02",
                "8".toFloat()
            )
        )
        tvshows.add(
            TvShowItem(
                1402,
                "316.766".toFloat(),
                "en",
                "The Walking Dead",
                "/qgjP2OrrX9gc6M270xdPnEmE9tC.jpg",
                "Sheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way.",
                "2010-10-31",
                "7.9".toFloat()
            )
        )
        tvshows.add(
            TvShowItem(
                68507,
                "430.44".toFloat(),
                "en",
                "His Dark Materials",
                "/g6tIKGc3f1H5QMz1dcgCwADKpZ7.jpg",
                "Lyra is an orphan who lives in a parallel universe in which science, theology and magic are entwined. Lyra's search for a kidnapped friend uncovers a sinister plot involving stolen children, and turns into a quest to understand a mysterious phenomenon called Dust. She is later joined on her journey by Will, a boy who possesses a knife that can cut windows between worlds. As Lyra learns the truth about her parents and her prophesied destiny, the two young people are caught up in a war against celestial powers that ranges across many worlds.",
                "2019-11-03",
                "8.1".toFloat()
            )
        )
        tvshows.add(
            TvShowItem(
                91605,
                "289.684".toFloat(),
                "en",
                "His Dark Materials",
                "/oogunE22HDTcTxFakKQbwqfw1qo.jpg",
                "Each hour-long film follows a different women as they experience “moments that are emotionally raw, thought-provoking and utterly personal”.",
                "2019-07-23",
                "4.8".toFloat()
            )
        )
        tvshows.add(
            TvShowItem(
                1911,
                "268.797".toFloat(),
                "en",
                "Bones",
                "/1bwF1daWnsEYYjbHXiEMdS587fR.jpg",
                "Dr. Temperance Brennan and her colleagues at the Jeffersonian's Medico-Legal Lab assist Special Agent Seeley Booth with murder investigations when the remains are so badly decomposed, burned or destroyed that the standard identification methods are useless.",
                "2005-09-13",
                "8.1".toFloat()
            )
        )
        return tvshows
    }



//    fun generateMovie(movieId: Int): MovieEntitiy {
//        lateinit var movie: MovieEntitiy
//        val movies: List<MovieEntitiy> = generateDummyMovies()
//        for (i in movies.indices) {
//            if (movieId == movies[i].movieId) {
//                movie = MovieEntitiy(
//                    movies[i].movieId,
//                    movies[i].poster,
//                    movies[i].title,
//                    movies[i].desc,
//                    movies[i].date_release,
//                    movies[i].user_score,
//                    movies[i].duration,
//                    movies[i].writer,
//                    movies[i].director
//                )
//            }
//        }
//        return movie
//    }

//    fun generateTvshow(tvshowId: Int): TvShowEntitiy {
//        lateinit var tvshow: TvShowEntitiy
//        val tvshows: List<TvShowEntitiy> = generateDummyTvshows()
//        for (i in tvshows.indices) {
//            if (tvshowId == tvshows[i].tvshowId) {
//                tvshow = TvShowEntitiy(
//                    tvshows[i].tvshowId,
//                    tvshows[i].poster,
//                    tvshows[i].title,
//                    tvshows[i].desc,
//                    tvshows[i].date_release,
//                    tvshows[i].user_score,
//                    tvshows[i].duration,
//                    tvshows[i].kreator
//                )
//            }
//        }


}