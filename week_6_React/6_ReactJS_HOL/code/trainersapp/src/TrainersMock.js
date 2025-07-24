import {Trainer} from "./trainer";
export const trainers = [
    new Trainer('Vivek_1225', 'Vivek', 'vivekch1225@gmail.com', '9876543210', 'Java',['Java', 'Spring', 'Jsp', 'Servlet']),
    new Trainer('Preethi_5899', 'Preethi', 'Preethi1989@gmail.com', '8765432d109', '.NET',['C#', 'SQL', 'Server', 'React']),
    new Trainer('Bhavas_4587', 'Bhavana', 'Bhavana34567@gmail.com', '76543d21098', 'Python',['Python', 'Django', 'Angular']),
];

export function getTrainerById(id) {
    return trainers.find(trainer => trainer.TrainerId === id);
}