import React from 'react';

const ListofPlayers = () => {
    // Array of 11 players with names and scores
    const players = [
        { name: "Virat Kohli", score: 120 },
        { name: "Rohit Sharma", score: 85 },
        { name: "KL Rahul", score: 65 },
        { name: "Shikhar Dhawan", score: 45 },
        { name: "Hardik Pandya", score: 78 },
        { name: "Rishabh Pant", score: 92 },
        { name: "Jasprit Bumrah", score: 15 },
        { name: "Ravindra Jadeja", score: 68 },
        { name: "Mohammed Shami", score: 22 },
        { name: "Yuzvendra Chahal", score: 35 },
        { name: "Bhuvneshwar Kumar", score: 42 }
    ];

    // Players with scores below 70 using arrow function
    const lowScorePlayers = players.filter(player => player.score < 70);

    return (
        <div>
            <h2>All Players</h2>
            <ul>
                {players.map((player, index) => (
                    <li key={index}>
                        {player.name} - {player.score} runs
                    </li>
                ))}
            </ul>

            <h2>Players with Scores Below 70</h2>
            <ul>
                {lowScorePlayers.map((player, index) => (
                    <li key={index}>
                        {player.name} - {player.score} runs
                    </li>
                ))}
            </ul>
        </div>
    );
};

export default ListofPlayers;