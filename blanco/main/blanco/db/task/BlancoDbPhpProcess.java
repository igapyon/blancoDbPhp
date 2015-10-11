/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ�莩����������܂����B
 */
package blanco.db.task;

import java.io.IOException;

import blanco.db.task.valueobject.BlancoDbPhpProcessInput;

/**
 * ���� [BlancoDbPhpProcess]�C���^�t�F�[�X�B
 *
 * ���̃C���^�t�F�[�X���p������ [blanco.db.task]�p�b�P�[�W��[BlancoDbPhpProcess]�N���X���쐬���Ď��ۂ̃o�b�`�������������Ă��������B<br>
 */
interface BlancoDbPhpProcess {
    /**
     * �N���X���C���X�^���X�����ď��������s����ۂ̃G���g���|�C���g�ł��B
     *
     * @param input �����̓��̓p�����[�^�B
     * @return �����̎��s���ʁB
     * @throws IOException ���o�͗�O�����������ꍇ�B
     * @throws IllegalArgumentException ���͒l�ɕs�������������ꍇ�B
     */
    int execute(final BlancoDbPhpProcessInput input) throws IOException, IllegalArgumentException;

    /**
     * �����̒��ŃA�C�e������������邽�тɐi���񍐂Ƃ��ăR�[���o�b�N���܂��B
     *
     * @param argProgressMessage ���ݏ������Ă���A�C�e���Ɋւ��郁�b�Z�[�W�B
     * @return ���������̂܂܌p������ꍇ�� false�B�������f�����N�G�X�g�������ꍇ�� true�B
     */
    boolean progress(final String argProgressMessage);
}
