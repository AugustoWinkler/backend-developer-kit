package utils;

/**
 * Utility class for formatting and removing formatting from CPF and CNPJ
 * numbers.
 * <p>
 * This class provides static methods to format CPF and CNPJ numbers into their
 * respective standard formats, as well as a method to remove the formatting
 * (i.e., returning only the raw digits).
 * </p>
 * 
 * <p>
 * CPF (Cadastro de Pessoas Físicas) and CNPJ (Cadastro Nacional da Pessoa
 * Jurídica) are identification numbers in Brazil. The formatting follows the
 * official patterns, which are:
 * <ul>
 * <li>CPF: XXX.XXX.XXX-XX</li>
 * <li>CNPJ: XX.XXX.XXX/XXXX-XX</li>
 * </ul>
 * </p>
 * 
 * @author Augusto.Winkler
 */
public class CpfCnpjFormat {

	/**
	 * Formats a CPF number into the standard CPF format (XXX.XXX.XXX-XX).
	 * <p>
	 * This method removes any non-digit characters and formats the CPF to the
	 * pattern "XXX.XXX.XXX-XX" if the input string has exactly 11 digits.
	 * </p>
	 * 
	 * @param cpf the CPF number to be formatted (can include non-digit characters)
	 * @return the formatted CPF number, or the original string if it cannot be
	 *         formatted
	 */
	public static String formatCpf(String cpf) {
		// Remove any non-digit characters
		cpf = cpf.replaceAll("[^\\d]", "");
		// Format if CPF has exactly 11 digits
		if (cpf.length() == 11) {
			cpf = cpf.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
		}
		return cpf;
	}

	/**
	 * Formats a CNPJ number into the standard CNPJ format (XX.XXX.XXX/XXXX-XX).
	 * <p>
	 * This method removes any non-digit characters and formats the CNPJ to the
	 * pattern "XX.XXX.XXX/XXXX-XX" if the input string has exactly 14 digits.
	 * </p>
	 * 
	 * @param cnpj the CNPJ number to be formatted (can include non-digit
	 *             characters)
	 * @return the formatted CNPJ number, or the original string if it cannot be
	 *         formatted
	 */
	public static String formatCnpj(String cnpj) {
		// Remove any non-digit characters
		cnpj = cnpj.replaceAll("[^\\d]", "");
		// Format if CNPJ has exactly 14 digits
		if (cnpj.length() == 14) {
			cnpj = cnpj.replaceAll("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})", "$1.$2.$3/$4-$5");
		}
		return cnpj;
	}

	/**
	 * Removes all formatting from a CPF or CNPJ number, returning only the raw
	 * digits.
	 * <p>
	 * This method removes any non-digit characters from the input string, whether
	 * it is a CPF or CNPJ number.
	 * </p>
	 * 
	 * @param formated the CPF or CNPJ number with formatting (e.g.,
	 *                 "XXX.XXX.XXX-XX" or "XX.XXX.XXX/XXXX-XX")
	 * @return the raw number as a string (only digits)
	 */
	public static String removeFormat(String formated) {
		// Remove all non-digit characters
		return formated.replaceAll("[^\\d]", "");
	}
}
