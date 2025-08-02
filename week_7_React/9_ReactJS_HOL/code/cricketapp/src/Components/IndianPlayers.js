import React from 'react';

const IndianPlayers = () => {
    const players = [
        "Virat Kohli", "Rohit Sharma", "KL Rahul", 
        "Shikhar Dhawan", "Hardik Pandya", "Rishabh Pant",
        "Jasprit Bumrah", "Ravindra Jadeja", "Mohammed Shami",
        "Yuzvendra Chahal", "Bhuvneshwar Kumar"
    ];

    // Destructuring for odd and even team players
    const [player1, player2, player3, player4, player5, player6, player7, player8, player9, player10, player11] = players;
    const oddTeamPlayers = [player1, player3, player5, player7, player9, player11];
    const evenTeamPlayers = [player2, player4, player6, player8, player10];

    // Two arrays to merge
    const T20players = ["Virat Kohli", "Rohit Sharma", "KL Rahul", "Hardik Pandya"];
    const RanjiTrophyPlayers = ["Cheteshwar Pujara", "Ajinkya Rahane", "Hanuma Vihari", "Abhimanyu Easwaran"];
    const mergedPlayers = [...T20players, ...RanjiTrophyPlayers];

    return (
        <div>
            <h2>Odd Team Players</h2>
            <ul>
                {oddTeamPlayers.map((player, index) => (
                    <li key={index}>{player}</li>
                ))}
            </ul>

            <h2>Even Team Players</h2>
            <ul>
                {evenTeamPlayers.map((player, index) => (
                    <li key={index}>{player}</li>
                ))}
            </ul>

            <h2>Merged Players (T20 + Ranji Trophy)</h2>
            <ul>
                {mergedPlayers.map((player, index) => (
                    <li key={index}>{player}</li>
                ))}
            </ul>
        </div>
    );
};

export default IndianPlayers;