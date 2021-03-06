package bridge.calculator.newer;

/** DesiredFactorialCalculator, implements DesiredCalculator
 * 
 * @author benbai123
 *
 */
public class DesiredFactorialCalculator implements DesiredCalculator {
	private Long _data;
	private Long _result;

	public void setData (Number data) {
		if (data == null) {
			data = 0;
		}
		_data = data.longValue();
	}
	public Number getValue () {
		if (_result == null) {
			calc();
		}
		return _result;
	}

	private void calc () {
		_result = 1L;
		for (int i = 2; i <= _data; i++) {
			_result = _result * i;
		}
	}
}