package core.basesyntax;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод для сравнения мощности
 * двигателей у двух авто (enginePower) и возврата разницы между ними.
 * Метод должен принимать Integer.</p>
 */
public class CompareTwoAuto implements AutoComparing {
    @Override
    public int apply(Integer firstCarVolume, Integer secondCarVolume) {
        return firstCarVolume - secondCarVolume;
    }
}
